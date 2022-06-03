import java.util.Scanner;

public class CalculoProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.print("Digite o primero numero: ");
        x = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        y = input.nextInt();
        System.out.print("Digite o terceiro numero: ");
        z = input.nextInt();
        System.out.printf("Product is %d", x * y * z);
    }
}
