import javax.swing.JFrame;

public class DrawRainbowTest {
    public static void main(String[] args) {
        DrawRainbow rainbow = new DrawRainbow();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(rainbow);
        app.setSize(400, 250);
        app.setVisible(true);
    }
}
