public class ExercicioRevisao432 {

    public static void main(String[] args) {

        for (int linha = 0; linha < 8; linha++) {
            if (linha % 2 != 0)
                System.out.print(" ");
            for (int coluna = 0; coluna < 8; coluna++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
