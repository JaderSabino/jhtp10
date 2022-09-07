import java.util.Scanner;

public class ExercicioRevisao429 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int tamanho = 0;
        while (tamanho == 0) {

            System.out.printf("Tamanho do quadrado: ");

            tamanho = input.nextInt();

            if (tamanho > 20 || tamanho < 1) {
                System.out.printf("Tamanho deve ser entre 1 e 20%n");
                tamanho = 0;
            }

        }

        for (int linha = 1; linha <= tamanho; linha++) {
            for (int coluna = 1; coluna <= tamanho; coluna++) {
                if (linha == 1 || linha == tamanho) {
                    System.out.printf("* ");
                } else {
                    if (coluna == 1 || coluna == tamanho)
                        System.out.printf("* ");
                    else 
                        System.out.printf("  ");
                }
            }
            System.out.println();
        }

    }

}
