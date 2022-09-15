import javax.swing.JFrame;

public class DrawAspiralRedondoTest {
    public static void main(String[] args) {
        DrawAspiralRedondo aspiral = new DrawAspiralRedondo();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(aspiral);
        app.setSize(400, 400);
        app.setVisible(true);
    }
}
