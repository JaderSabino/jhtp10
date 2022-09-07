import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel3 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // pode ser substituido por @override
        
        int width = getWidth();
        int height = getHeight();

        int um15X = width/15;
        int um15Y = height/15;

        int x = 0, y = 0;
        int i = 1;
        while (i < 15) {
            g.drawLine(x, y, um15X*i, height);
            i++;
            y += um15Y;
        }

        x = width;
        y = 0;
        i = 1;
        while (i < 15) {
            g.drawLine(x, y, width-(um15X*i), height);
            i++;
            y += um15Y;
        }

        x = 0;
        y = height;
        i = 1;
        while (i < 15) {
            g.drawLine(x, y, um15X*i, 0);
            i++;
            y -= um15Y;
        }

        x = width;
        y = height;
        i = 1;
        while (i < 15) {
            g.drawLine(x, y, width-(um15X*i), 0);
            i++;
            y -= um15Y;
        }
        
    }
}