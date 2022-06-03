import java.util.Scanner;

public class Questao224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Primeiro numero: ");
        int num1 = input.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = input.nextInt();
        System.out.print("Terceiro numero: ");
        int num3 = input.nextInt();
        System.out.print("Quarto numero: ");
        int num4 = input.nextInt();
        System.out.print("Quinto numero: ");
        int num5 = input.nextInt();
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.printf("Numero %d e maior%n", num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.printf("Numero %d e maior%n", num2);
        } else if ((num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5)) {
            System.out.printf("Numero %d e maior%n", num3);
        } else if ((num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5)) {
            System.out.printf("Numero %d e maior%n", num4);
        } else if ((num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4)) {
            System.out.printf("Numero %d e maior%n", num5);
        }
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            System.out.printf("Numero %d e menor", num1);
        } else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
            System.out.printf("Numero %d e menor", num2);
        } else if ((num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5)) {
            System.out.printf("Numero %d e menor", num3);
        } else if ((num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5)) {
            System.out.printf("Numero %d e menor", num4);
        } else if ((num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4)) {
            System.out.printf("Numero %d e menor", num5);
        }
    }
}