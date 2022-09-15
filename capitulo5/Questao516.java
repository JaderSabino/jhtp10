import java.util.Scanner;

public class Questao516 {

    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int count = 1;

        int numeros[] = new int[6];
        
        while (count <= 5) {

            System.out.printf("digite o %do numero: ", count);
            int numero = input.nextInt();
            
            if (numero < 1 || numero > 30) {
                System.out.printf("%n%nfora do intervalo valido, digite outro%n%n");
            } else {
                numeros[count++] = numero;
            }

        }

        System.out.println();

        for (int i = 1; i < numeros.length; i++) {
            System.out.printf("%2so (%02d): ", i, numeros[i]);
            for (int j = 0; j < numeros[i]; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }

}