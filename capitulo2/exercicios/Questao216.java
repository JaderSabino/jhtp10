import java.util.Scanner;

public class Questao216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundoNumero = input.nextInt();
        if (primeiroNumero > segundoNumero)
            System.out.printf("%d is larger", primeiroNumero);
        if (primeiroNumero < segundoNumero)
            System.out.printf("%d is larger", segundoNumero);
        if (primeiroNumero == segundoNumero)
            System.out.print("These numbers are equal");
    }
}