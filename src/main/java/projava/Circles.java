package projava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
public class Circles {
    public static void main(String[] args) {
        var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var g =  image.createGraphics();
        for (int x = 0; x < 12; x++) {
            for (int y = 0 ; y < 12 ; y++) {
                g.fillOval(x * 30 + 50, y * 30 + 20, 25, 25);
            }
        }
        var f = new JFrame("格子");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel(new ImageIcon(image)));
        f.pack();
        f.setVisible(true);

        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++) {
                if (y == 3) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.white);
                }
                g.fillOval(x * 30 + 50, y * 30 + 20, 25, 25);
            }
        }
    }


}
