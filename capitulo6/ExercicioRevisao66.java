import java.util.Scanner;

public class ExercicioRevisao66 {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double radius;

        System.out.printf("raio: ");
        radius = input.nextDouble();

        double volume = sphereVolume(radius);

        System.out.printf("volume: %.2f", volume);

    }

    public static double sphereVolume(double radius) {
        return ( 4.0 / 3.0 ) * Math.PI * Math.pow(radius, 3);
    }
}
