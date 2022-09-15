import javax.swing.JFrame;

public class DrawAlvoTest {
    public static void main(String[] args) {
        //DrawAlvo alvo = new DrawAlvo();
        DrawCrazy alvo = new DrawCrazy();
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(alvo);
        app.setSize(240, 260);
        app.setVisible(true);
    }
}
