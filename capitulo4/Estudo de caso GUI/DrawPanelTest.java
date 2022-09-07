import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel3 panel = new DrawPanel3();

        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.add(panel);
        app.setSize(250, 250);
        app.setVisible(true);
    }    
}
