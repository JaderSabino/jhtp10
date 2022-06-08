import javax.swing.JOptionPane;

public class EstudoCasoGUI {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digita o primeito numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digita o segundo numero"));
        JOptionPane.showMessageDialog(null, "Soma dos numeros digitados " + (num1 + num2));
    }
}
