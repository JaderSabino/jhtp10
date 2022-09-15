import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawAspiralRedondo extends JPanel {

    public DrawAspiralRedondo() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {

        int x = getWidth() / 2 - 10;
        int y = getHeight() / 2 - 10;
        int width = 20;
        int height = 20;
        int startAngle = 0;
        int arcAngle = 180;
        int depth = 10;
        for (int i = 0; i < 20; i++) {
            width += 2 * depth;
            height += 2 * depth;
            arcAngle *= -1;
            y -= depth;
            if (i % 2 != 0) {
                x -= 2 * depth;
            }
            g.drawArc(x, y, width, height, startAngle, arcAngle);
        }

    }
}
