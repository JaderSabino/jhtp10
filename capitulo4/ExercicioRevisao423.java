import java.util.Scanner;

public class ExercicioRevisao423 {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out
                .printf("Entre com a quantidade vendida por cada vendedor separdo por espaco.%n");
        String entrada = input.nextLine();

        String dadosDecompostos[] = entrada.split(" ");

        int maior = 0;
        int segundoMaior = 0;

        try {
            for (String unidades : dadosDecompostos) {
                if (Integer.parseInt(unidades) > maior) {
                    segundoMaior = maior;
                    maior = Integer.parseInt(unidades);
                } else {
                    
                }
                if (Integer.parseInt(unidades) > segundoMaior && Integer.parseInt(unidades) != maior)
                    segundoMaior = Integer.parseInt(unidades);
            }
        } catch (NumberFormatException e) {
            System.out.printf("%n%nErro nos dados inseridos.%n%n");
        }

        System.out.printf("%n%nO maior numero inserido foi %d.%n%n", maior);
        System.out.printf("%n%nO segundo maior numero inserido foi %d.%n%n", segundoMaior);

    }

}
