import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;

public class DrawCrazy extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
        Random random = new Random();
        int width = getWidth();
        int height = getHeight();

        for (int i = 0; i < 10; i++) {
            int r1 = random.nextInt(255);
            int gr1 = random.nextInt(255);
            int b1 = random.nextInt(255);
            Color color = new Color(r1, gr1, b1);

            int xi = random.nextInt(width);
            int yi = random.nextInt(height);

            int wi = random.nextInt(width / 2);
            int hi = random.nextInt(height / 2);
            
            int forma = random.nextInt(1);

            if (forma == 1) {
                g.setColor(color);
                g.fillRect(xi, yi, wi, hi);
            } else {
                g.setColor(color);
                g.fillOval(xi, yi, wi, hi);
            }
            
        }
    }
}
