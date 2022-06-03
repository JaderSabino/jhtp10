import java.util.Scanner;

public class Questao233 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Peso: ");
        double peso = input.nextDouble();
        System.out.print("Altura: ");
        double altura = input.nextDouble();
        System.out.printf("IMC = %.1f%n", peso / (altura * altura));
        System.out.printf("BMI VALUES%n");
        System.out.printf("Underweight: less than 18.2%n");
        System.out.printf("Normal:      between 18.5 and 24.9%n");
        System.out.printf("Overweight:  between 25 and 29.9%n");
        System.out.printf("Obese:       30 or greater");
    }
}