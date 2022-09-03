package org.example.resizeImage;

import org.example.ImageResize;
import org.imgscalr.Scalr;

import java.awt.image.BufferedImage;

public class ImageScalerResizer implements ImageResize {

    @Override
    public BufferedImage resize(BufferedImage originalImage, int width, int height) throws Exception {
        return Scalr.resize(originalImage, Scalr.Method.ULTRA_QUALITY, Scalr.Mode.FIT_EXACT, width, height, Scalr.OP_ANTIALIAS);
    }
}
