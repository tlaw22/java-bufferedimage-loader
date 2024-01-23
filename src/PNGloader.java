package domain;
import java.awt.image.BufferedImage;
import java.io.IOException;


import javax.imageio.ImageIO;

public class PNGloader {
    private BufferedImage image;
    public BufferedImage loadImage(String path) {
        try {
            image = ImageIO.read(getClass().getResource(path));
        } catch (IOException e) {
            
            e.printStackTrace();
            System.out.println("Error " + e.getMessage());
        }
        return image;
    }

}
