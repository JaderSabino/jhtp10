import javax.swing.JFrame;

public class ShapesTest {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(shapes);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
