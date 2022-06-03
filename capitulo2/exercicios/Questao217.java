import java.util.Scanner;

public class Questao217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundoNumero = input.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int terceiroNumero = input.nextInt();
        System.out.printf("A Soma dos numeros digitados e %d%n", primeiroNumero + segundoNumero + terceiroNumero);
        System.out.printf("A Media dos numeros digitados e %d%n", (primeiroNumero + segundoNumero + terceiroNumero) / 3);
        System.out.printf("O Produto dos numeros digitados e %d%n", primeiroNumero * segundoNumero * terceiroNumero);
        int[] listaNumeros = {
            primeiroNumero,
            segundoNumero,
            terceiroNumero
        };
        sort(listaNumeros);
        sort(listaNumeros);
        System.out.printf("O maior numero e o %d%n", listaNumeros[0]);
        System.out.printf("O menor numero e o %d", listaNumeros[2]);
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1 ; i++) {
            if (array[i] < array[i+1]) {
                int aux = array[i];
                array[i] = array[i+1];
                array[i+1] = aux;
            }
        }
    }
}