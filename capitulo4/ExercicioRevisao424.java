import java.util.Scanner;

public class ExercicioRevisao424 {

    private static Scanner input = new Scanner(System.in);

    private static final int APROVADO = 1;
    private static final int REPROVADO = 2;
    public static void main(String[] args) {

        int resultados[] = new int[3];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Entre com o resultado (1 = aprovado, 2 = reprovado): ");
            int valor = input.nextInt();
            if (valor != 1 && valor != 2) {
                --i;
                continue;
            }
            ++resultados[valor];
        }

        System.out.printf("aprovados: %d%nreprovados: %d%n", resultados[APROVADO], resultados[REPROVADO]);

        if (resultados[APROVADO] > 8)
            System.out.printf("Bonus para o professor!%n");
    }

}
