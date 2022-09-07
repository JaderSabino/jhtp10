import java.util.Scanner;

public class ExercicioRevisao421 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out
                .printf("Entre com a quantidade vendida por cada vendedor separdo por espaco.%n");
        String entrada = input.nextLine();

        String dadosDecompostos[] = entrada.split(" ");

        int maior = 0;

        try {
            for (String unidades : dadosDecompostos) {
                if (Integer.parseInt(unidades) > maior)
                    maior = Integer.parseInt(unidades);
            }
        } catch (NumberFormatException e) {
            System.out.printf("%n%nErro nos dados inseridos.%n%n");
        }

        System.out.printf("%n%nO maior numero inserido foi %d.%n%n", maior);

    }

}
