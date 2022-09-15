public class Questao520 {

    public static void main(String[] args) {
        
        int divisor = 3;
        int variacaoDivisor = 2;
        int constante4 = 4;
        double pi = constante4;

        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                pi -= constante4 / (double) divisor;
            } else {
                pi += constante4 / (double) divisor;
            }
            System.out.println(pi);
            divisor += variacaoDivisor;
        }

    }
}