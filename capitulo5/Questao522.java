public class Questao522 {
    
    public static void main(String[] args) {
        int tamanhoTrianguloA = 1;
        int tamanhoTrianguloB = 10;
        int tamanhoTrianguloC = 10;
        int tamanhoTrianguloD = 1;
        for (int linha = 1; linha <= 10; linha++) {
            
            System.out.print(linha == 1 ? " a) " : "    ");
            
            imprimirAsterisco(tamanhoTrianguloA);
            imprimirEspaco(tamanhoTrianguloA);
            tamanhoTrianguloA++;

            System.out.print(linha == 1 ? " b) " : "    ");

            imprimirAsterisco(tamanhoTrianguloB);
            imprimirEspaco(tamanhoTrianguloB);
            tamanhoTrianguloB--;

            System.out.print(linha == 1 ? " c) " : "    ");
            
            imprimirEspaco(tamanhoTrianguloC);
            imprimirAsterisco(tamanhoTrianguloC);
            tamanhoTrianguloC--;

            System.out.print(linha == 1 ? " d) " : "    ");
            
            imprimirEspaco(tamanhoTrianguloD);
            imprimirAsterisco(tamanhoTrianguloD);
            tamanhoTrianguloD++;

            System.out.println();
        }
    }

    private static void imprimirAsterisco(int tamanho) {
        for (int inicio = 1; inicio <= tamanho; inicio++) {
            System.out.print("*");
        }
    }

    private static void imprimirEspaco(int tamanho) {
        for (int inicio = 10; inicio > tamanho; inicio--) {
            System.out.print(" ");
        }
    }

}