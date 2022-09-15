public class Questao524 {

    public static void main(String[] args) {

        

        int quantidadeAsterisco = 1;
        int quantidadeEspaco = 8;
        boolean meio = false;
        for (int linha = 1; linha < 10; linha++) {

            if (quantidadeAsterisco >= 9)
                meio = true;

            imprimirEspaco(quantidadeEspaco / 2);
            imprimirAsterisco(quantidadeAsterisco);
            imprimirEspaco(quantidadeEspaco / 2);
            System.out.println();

            if (meio) {
                quantidadeEspaco += 2;
                quantidadeAsterisco -= 2;
            } else {
                quantidadeAsterisco += 2;
                quantidadeEspaco -= 2;
            }

        }
    }

    private static void imprimirAsterisco(int tamanho) {
        for (int inicio = 1; inicio <= tamanho; inicio++) {
            System.out.print("*");
        }
    }

    private static void imprimirEspaco(int tamanho) {
        for (int inicio = 1; inicio <= tamanho; inicio++) {
            System.out.print(" ");
        }
    }

}