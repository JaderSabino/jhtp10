import java.util.Scanner;

public class Questao215 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundoNumero = input.nextInt();
        System.out.printf("%d + %d = %d%n", primeiroNumero, segundoNumero, primeiroNumero + segundoNumero);
        System.out.printf("%d x %d = %d%n", primeiroNumero, segundoNumero, primeiroNumero * segundoNumero);
        System.out.printf("%d - %d = %d%n", primeiroNumero, segundoNumero, primeiroNumero - segundoNumero);
        System.out.printf("%d / %d = %.1f", primeiroNumero, segundoNumero, ( (float) primeiroNumero) / segundoNumero);
    }
}