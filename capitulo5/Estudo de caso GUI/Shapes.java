import javax.swing.JPanel;
import java.awt.Graphics;

public class Shapes extends JPanel {
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int midWidth = width / 2;
        int midHeight = height / 2;
        int sizeCircle = 10;
        for (int i = 0; i < 20; i++) {
            g.drawOval(midWidth - sizeCircle / 2, midHeight - sizeCircle / 2, sizeCircle, sizeCircle);
            sizeCircle += 10;
        }
    }
}
