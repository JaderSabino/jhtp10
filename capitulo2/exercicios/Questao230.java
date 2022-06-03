import java.util.Scanner;

public class Questao230 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        Scanner input = new Scanner(System.in);
        System.out.print("Numero: ");
        int numero = input.nextInt();
        num5 = numero % 10;
        numero = numero / 10;
        num4 = numero % 10;
        numero = numero / 10;
        num3 = numero % 10;
        numero = numero / 10;
        num2 = numero % 10;
        numero = numero / 10;
        num1 = numero % 10;
        System.out.printf("%d   %d   %d   %d   %d", num1, num2, num3, num4, num5);
    }
}