public class Questao526 {

    public static void main(String[] args) {

        for (int count = 1; count <= 10; count++) {
            if (count == 5) {
                count = 11;
            } else {
                System.out.printf("%d ", count);
            }
        }

        System.out.printf("%nAlternativa ao break para parar o loop quando count for igual 5%n");

    }

}