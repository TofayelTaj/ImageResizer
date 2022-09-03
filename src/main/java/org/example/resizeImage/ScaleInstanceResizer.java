package org.example.resizeImage;

import org.example.ImageResize;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ScaleInstanceResizer implements ImageResize {
    @Override
    public BufferedImage resize(BufferedImage originalImage, int width, int height) throws Exception {
        Image resultingImage = originalImage.getScaledInstance(width, height, originalImage.getType());
        BufferedImage outputImage = new BufferedImage(width, height, originalImage.getType());
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, width, height, null);
        return outputImage;
    }
}
