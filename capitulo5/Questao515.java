public class Questao515 {
    
    public static void main(String[] args) {
        for (int linha = 1; linha <= 10; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.printf("%n%n");

        for (int linha = 10; linha >= 1; linha--) {
            for (int coluna = linha; coluna >= 1; coluna--) {
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.printf("%n%n");

        int espaco = 0;

        for (int linha = 10; linha >= 1; linha--) {
            for (int i = 0; i < espaco; i++) {
                System.out.printf(" ");
            }
            for (int coluna = linha; coluna >= 1; coluna--) {
                System.out.printf("*");
            }
            espaco++;
            System.out.println();
        }

        espaco = 9;

        for (int linha = 1; linha <= 10; linha++) {
            for (int i = 0; i < espaco; i++) {
                System.out.printf(" ");
            }
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.printf("*");
            }
            espaco--;
            System.out.println();
        }

    }

}