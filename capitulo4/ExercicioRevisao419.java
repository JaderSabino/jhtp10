import java.util.Scanner;

public class ExercicioRevisao419 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.printf("Entre com os valores dos itens vendidos pelo vendedor na semana separado por espaco.%n");

        String entrada = input.nextLine();

        String dadosDecompostos[] = entrada.split(" ");

        try {

            double totalVendido = 0;

            for (int i = 0; i < dadosDecompostos.length; i++) {
                totalVendido += Double.parseDouble(dadosDecompostos[i]);
            }

            System.out.printf("total vendiddo: %.2f%n", totalVendido);
            System.out.printf("valor a receber: %.2f%n", 200 + (totalVendido * (9/100.0)));

        } catch (NumberFormatException e) {
            System.out.printf("Erro nos dados inseridos");
        }
    }
}
