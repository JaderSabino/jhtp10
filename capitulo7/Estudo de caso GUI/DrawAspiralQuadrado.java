import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawAspiralQuadrado extends JPanel {

    public DrawAspiralQuadrado() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {

        final int centerX = getWidth() / 2;
        final int centerY = getHeight() / 2;

        int acres = centerX * 2 / 7;
        int ped = acres;

        int iniX = centerX;
        int iniY = centerY;

        int fimX = 0;
        int fimY = 0;

        int direcao = 0;

        for (int i = 0; i < 13; i++) {
            g.setColor(Color.RED);

            if (i % 2 == 0 && i != 0)
                acres += ped;

            if (direcao > 3)
                direcao = 0;

            switch (direcao) {
                case 0:
                    fimX = iniX;
                    fimY = iniY + acres;
                    break;
                case 1:
                    fimX = iniX - acres;
                    fimY = iniY;
                    break;
                case 2:
                    fimX = iniX;
                    fimY = iniY - acres;
                    break;
                case 3:
                    fimX = iniX + acres;
                    fimY = iniY;
                    break;
            }

            g.drawLine(iniX, iniY, fimX, fimY);

            iniX = fimX;
            iniY = fimY;

            direcao++;

        }

    }
}
