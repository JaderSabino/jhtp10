public class Questao523D {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(!((i > 4) || (j <= 6)));
                System.out.println(!(i > 4) && !(j <= 6));
                System.out.println();
            }
        }
    }

}