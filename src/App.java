package domain;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.imageio.ImageIO;

public class App {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(200, 400);
        
        BufferedImage image = ImageIO.read(new File("C:\\Users\\timot\\Documents\\code\\test-site\\test-site\\src\\domain\\heart-icon.png"));
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < 10; i++) {
                g.drawImage(image, i+40, i+40 , null);
            }}
        };

        frame.add(pane);
        frame.setVisible(true);
    }
}