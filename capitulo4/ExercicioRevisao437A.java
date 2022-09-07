import java.util.Scanner;

public class ExercicioRevisao437A {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int numero;

        System.out.printf("Digite o numero que deseja realizar o calculo fatorial: ");
        numero = input.nextInt();

        System.out.printf("fatorial de %d: %d", numero, fatorial(numero));

    }

    public static int fatorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * fatorial(--numero);
        }
    }

}
