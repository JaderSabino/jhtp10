import java.util.Scanner;

public class ExercicioRevisao435 {

    private static Scanner input = new Scanner(System.in);

    private static final int LADO_A = 0;
    private static final int LADO_B = 1;
    private static final int LADO_C = 2;

    public static void main(String[] args) {

        String lados;
        String ladosTriagulo[];

        System.out.printf("Digite os lados separados por espaco: ");
        lados = input.nextLine();

        ladosTriagulo = lados.split(" ");

        System.out.println(
            Integer.parseInt(ladosTriagulo[LADO_A]) + Integer.parseInt(ladosTriagulo[LADO_B]) > Integer.parseInt(ladosTriagulo[LADO_C]) &&
            Integer.parseInt(ladosTriagulo[LADO_B]) + Integer.parseInt(ladosTriagulo[LADO_C]) > Integer.parseInt(ladosTriagulo[LADO_A]) &&
            Integer.parseInt(ladosTriagulo[LADO_A]) + Integer.parseInt(ladosTriagulo[LADO_C]) > Integer.parseInt(ladosTriagulo[LADO_B]) ?
            "Esses lados podem formar um triangulo" :
            "Esses lados nao podem formar um triangulo"
        );

    }

}
