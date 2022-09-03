package org.example.resizeImage;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.resizers.configurations.ScalingMode;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ScaleImage {


    public BufferedImage scaleImageWidthThumbnailator(BufferedImage originalImage, int width) throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int imgWidth = originalImage.getWidth();
        int height = originalImage.getHeight();
        Thumbnails.of(originalImage)
                .outputFormat("JPEG")
                .outputQuality(1)
                .scalingMode(ScalingMode.BICUBIC)
                .scale(0.7812)
//                .forceSize(imgWidth + width, height)
                .toOutputStream(outputStream);
//        byte[] data = outputStream.toByteArray();
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
//        Thumbnails.of(ImageIO.read(inputStream))
//                .forceSize(1000, 1000)
//                .outputQuality(1)
//                .outputFormat("jpeg")
//                .toOutputStream(outputStream);
        ByteArrayInputStream inputStream1 = new ByteArrayInputStream(outputStream.toByteArray());
        return ImageIO.read(inputStream1);
    }



}
