import java.util.Scanner;

public class ExercicioRevisao437C {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int numero;

        System.out.printf("Digite o numero que deseja realizar o calculo da contante e^: ");
        numero = input.nextInt();

        System.out.printf("contante e elevado de %d: %.6f", numero, constanteEElevado(numero));

    }

    public static double constanteEElevado(int numero) {
        double contante = 0;
        for (int i = 1; i <= numero; i++) {
            contante += Math.pow(numero, i) / (double) fatorial(i);
        }
        return 1 + contante;
    }

    public static int fatorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * fatorial(--numero);
        }
    }

}
