public class Questao523A {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int x = i;
                int y = j;

                System.out.println(!(x < 5) && !(y >= 7));
                System.out.println(!((x < 5) || (y >= 7)));
                System.out.println();
            }
        }
    }

}