import java.util.Scanner;

public class ExercicioRevisao433 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = 1;
        int contadorItensPorLinha = 0;
        
        while (true) {
            if (numero % 2 == 0) {
                System.out.print(numero + ", ");
                ++contadorItensPorLinha;
            }
            if (contadorItensPorLinha == 50) {
                System.out.println();
                contadorItensPorLinha = 0;
            }
            ++numero;
        }

    }

}
