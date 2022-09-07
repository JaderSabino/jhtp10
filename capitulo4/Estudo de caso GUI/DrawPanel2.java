import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel2 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // pode ser substituido por @override
        
        int width = getWidth();
        int height = getHeight();

        int um15X = width/15;
        int um15Y = height/15;

        int i = 1;
        while (i < 15) {
            g.drawLine(0, 0, um15X*i, height-(um15Y*i));
            i++;
        }

        i = 1;
        while (i < 15) {
            g.drawLine(width, 0, width-(um15X*i), height-(um15Y*i));
            i++;
        }

        i = 1;
        while (i < 15) {
            g.drawLine(0, height, width-(um15X*i), height-(um15Y*i));
            i++;
        }

        i = 1;
        while (i < 15) {
            g.drawLine(width, height, um15X*i, height-(um15Y*i));
            i++;
        }
        
    }
}