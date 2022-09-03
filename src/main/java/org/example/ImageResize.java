package org.example;

import java.awt.image.BufferedImage;

public interface ImageResize {

    BufferedImage resize(BufferedImage originalImage, int width, int height) throws Exception;


}
