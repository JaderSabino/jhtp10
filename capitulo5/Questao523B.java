public class Questao523B {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                for (int j2 = 1; j2 <= 10; j2++) {
                    int a = i;
                    int b = j;
                    int g = j2;

                    System.out.println(!(a == b) || !(g != 5));
                    System.out.println(!((a == b) && (g != 5)));
                    System.out.println();
                }
            }
        }
    }

}