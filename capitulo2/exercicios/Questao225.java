import java.util.Scanner;

public class Questao225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("E par");
        } else {
            System.out.println("E impar");
        }
    }
}