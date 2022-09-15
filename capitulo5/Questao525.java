import java.util.Scanner;

public class Questao525 {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        int tamanhoLosango;
        
        while (true) {
            System.out.print("Digite um numero impar de 1 a 19: ");
            tamanhoLosango = input.nextInt();
            
            if (tamanhoLosango % 2 == 0 || ( tamanhoLosango < 1 || tamanhoLosango > 19 ))
            System.out.println("Numero incorreto, favor digitar outro numero");
            else
            break;
        }

        int quantidadeAsterisco = 1;
        int quantidadeEspaco = tamanhoLosango - 1;

        boolean meio = false;
        for (int linha = 1; linha <= tamanhoLosango; linha++) {

            if (quantidadeAsterisco >= tamanhoLosango)
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