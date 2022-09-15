import java.util.Scanner;

public class Questao511 {
    
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite a quantidade de numeros a serem lidos: ");
        int quantidadeDeNumerosLidos = input.nextInt();

        int numeros[] = new int[quantidadeDeNumerosLidos];

        int menorNumeroLido;

        for (int i = 0; i < quantidadeDeNumerosLidos; i++) {
            System.out.printf("%do numero: ", i+1);
            numeros[i] = input.nextInt();
        }

        menorNumeroLido = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menorNumeroLido)
                menorNumeroLido = numeros[i];
        }

        System.out.printf("O menor numero lido foi %d", menorNumeroLido);
    }
}