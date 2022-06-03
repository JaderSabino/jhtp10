import java.util.Scanner;
public class Questao228 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        int raio = input.nextInt();
        System.out.printf("Diametro: %d%n", 2 * raio);
        System.out.printf("Circunferencia: %.2f%n", 2 * raio * Math.PI);
        System.out.printf("Area: %.2f", Math.PI * raio * raio);
    }
}