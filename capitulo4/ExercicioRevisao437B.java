import java.util.Scanner;

public class ExercicioRevisao437B {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int numero;

        System.out.printf("Digite o numero que deseja realizar o calculo da contante e: ");
        numero = input.nextInt();

        System.out.printf("contante e de %d: %.6f", numero, constanteE(numero));

    }

    public static double constanteE(int numero) {
        if (numero < 1) {
            return 1;
        } else {
            return 1.0 / fatorial(numero) + constanteE(--numero);
        }
    }

    public static int fatorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * fatorial(--numero);
        }
    }

}
