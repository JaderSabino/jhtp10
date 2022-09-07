import java.util.Scanner;

public class ExercicioRevisao431 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String numero;
        int expoente = 1;
        int numeroDecimal = 0;

        System.out.printf("Numero binario: ");
        numero = input.nextLine();

        for (int posicao = numero.length() - 1; posicao >= 0; posicao--) {
            numeroDecimal += Integer.parseInt(String.valueOf(numero.charAt(posicao))) * expoente;
            expoente *= 2;
        }

        System.out.printf("Numero decimal: %d", numeroDecimal);

    }

}
