import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;

public class DrawAlvo extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        Random random = new Random();
        int r1 = random.nextInt(255);
        int gr1 = random.nextInt(255);
        int b1 = random.nextInt(255);
        int r2 = random.nextInt(255);
        int gr2 = random.nextInt(255);
        int b2 = random.nextInt(255);
        Color color1 = new Color(r1, gr1, b1);
        Color color2 = new Color(r2, gr2, b2);
        int xi = 10;
        int yi = 10;
        int wi = 200;
        int hi = 200;
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) {
                g.setColor(color1);
            } else {
                g.setColor(color2);
            }
            
            g.fillOval(xi, yi, wi, hi);
            xi += 10;
            yi += 10;
            wi -= 20;
            hi -= 20;
        }
    }
}
