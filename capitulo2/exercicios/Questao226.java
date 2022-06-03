import java.util.Scanner;

public class Questao226 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = input.nextInt();
        if (num1 % num2 == 0) {
            System.out.printf("%d e multiplo de %d", num1, num2);
        } else {
            System.out.printf("%d nao e multiplo de %d", num1, num2);
        }
    }
}