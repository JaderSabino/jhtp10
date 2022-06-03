import java.util.Scanner;

public class Questao232 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positivo = 0, negativo = 0, zero = 0;
        System.out.print("Primeiro numero: ");
        int num = input.nextInt();
        if (num > 0) {
            positivo = positivo + 1;
        }
        if (num < 0) {
            negativo = negativo + 1;
        }
        if (num == 0) {
            zero = zero + 1;
        }
        System.out.print("Segundo numero: ");
        num = input.nextInt();
        if (num > 0) {
            positivo = positivo + 1;
        }
        if (num < 0) {
            negativo = negativo + 1;
        }
        if (num == 0) {
            zero = zero + 1;
        }
        System.out.print("Terceiro numero: ");
        num = input.nextInt();
        if (num > 0) {
            positivo = positivo + 1;
        }
        if (num < 0) {
            negativo = negativo + 1;
        }
        if (num == 0) {
            zero = zero + 1;
        }
        System.out.print("Quarto numero: ");
        num = input.nextInt();
        if (num > 0) {
            positivo = positivo + 1;
        }
        if (num < 0) {
            negativo = negativo + 1;
        }
        if (num == 0) {
            zero = zero + 1;
        }
        System.out.print("Quinto numero: ");
        num = input.nextInt();
        if (num > 0) {
            positivo = positivo + 1;
        }
        if (num < 0) {
            negativo = negativo + 1;
        }
        if (num == 0) {
            zero = zero + 1;
        }
        System.out.printf("Positivos: %d%n", positivo);
        System.out.printf("Negativos: %d%n", negativo);
        System.out.printf("Zeros: %d", zero);
    }
}