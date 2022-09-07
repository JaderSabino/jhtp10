import java.util.Scanner;

public class ExercicioRevisao422 {

    private static Scanner input = new Scanner(System.in);
    private static int tamanho = 0;

    public static void main(String[] args) {

        System.out.printf("tamanho da tabela: ");

        tamanho = input.nextInt();

        System.out.printf("%-10s%-10s%-10s%-10s%n", "N", "10*N", "100*N", "1000*N");

        imprimirTabela(1);
    //    for (int i = 1; i <= tamanho; i++) {
    //        System.out.printf("%-10d%-10d%-10d%-10d%n", i, i*10, i*100, i*1000);
    //    }

    }

    public static void imprimirTabela(int numero) {
        System.out.printf("%-10d%-10d%-10d%-10d%n", numero, numero*10, numero*100, numero*1000);
        if (numero == tamanho) {
            return;
        } else {
            imprimirTabela(numero+1);
        }
    }

}
