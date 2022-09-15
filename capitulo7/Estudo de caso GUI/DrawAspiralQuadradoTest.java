import javax.swing.JFrame;

public class DrawAspiralQuadradoTest {
    public static void main(String[] args) {
        DrawAspiralQuadrado aspiral = new DrawAspiralQuadrado();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(aspiral);
        app.setSize(400, 400);
        app.setVisible(true);
    }
}
