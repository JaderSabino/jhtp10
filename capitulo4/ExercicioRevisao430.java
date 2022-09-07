import java.util.Scanner;

public class ExercicioRevisao430 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String numero;
        while (true) {

            System.out.printf("Numero de 5 digitos: ");

            numero = input.next();

            if (numero.length() != 5) {
                System.out.printf("Quantidade de digitos deve ser 5%n");
                continue;
            }

            break;

        }

        if (numero.charAt(0) == numero.charAt(4) && numero.charAt(1) == numero.charAt(3)) {
            System.out.printf("E palindromo");
        } else {
            System.out.printf("Nao e palindromo");
        }

    }

}
