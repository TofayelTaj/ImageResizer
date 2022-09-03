package org.example;

import org.example.resizeImage.ScaleImage;
import org.example.resizeImage.ThumbnailatorResizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class App {
    public static void main(String[] args) {
        int height = 392;
        int width = 392;
        String path = "/home/tofayel/Downloads/RowProductImage/239438.jpg";
        File imgfile = new File(path);
        File saveFile = new File(imgfile.getParentFile().getParentFile() + "/239438/" + width + " * " + height + "_scale_" + imgfile.getName());

//        ImageResize imageResizer = new ImageScalerResizer();
//        ImageResize imageResizer = new ThumbnailatorResizer();
//
//        doResize(imageResizer, saveFile, imgfile, width, height);

       ScaleImage scaleImageObj = new ScaleImage();
       scaleImage(imgfile, scaleImageObj, saveFile, 200);

    }

    public static void doResize(ImageResize imageResizer, File saveFilePath, File imgPath, int width, int height){
        try {
            BufferedImage img = imageResizer.resize( ImageIO.read(imgPath), width, height);
            ImageIO.write(img, "jpg", saveFilePath);
            System.out.println("successful");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void scaleImage(File imgFile, ScaleImage scaleImage, File savePath, int width ){
        try{
            BufferedImage img = scaleImage.scaleImageWidthThumbnailator(ImageIO.read(imgFile), width);
            ImageIO.write(img, "jpg", savePath);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
