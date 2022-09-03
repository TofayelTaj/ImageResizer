package org.example.resizeImage;

import net.coobird.thumbnailator.Thumbnails;
import org.example.ImageResize;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ThumbnailatorResizer implements ImageResize {
    @Override
    public BufferedImage resize(BufferedImage originalImage, int width, int height) throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Thumbnails.of(originalImage)
                .outputFormat("JPG")
                .outputQuality(1)
                .forceSize(width, height)
                .toOutputStream(outputStream);
        byte[] data = outputStream.toByteArray();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        return ImageIO.read(inputStream);
    }
}
