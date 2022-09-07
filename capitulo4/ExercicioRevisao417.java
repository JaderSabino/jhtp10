import java.util.Scanner;

public class ExercicioRevisao417 {
    
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int kilometros = 0;
        int litros = 0;
        int totalKilometros = 0;
        int totalLitros = 0;
        while (true) {
            System.out.printf("Digite quantos kilometros dirigidos ou -1 para encerrar o calculo: ");
            kilometros = input.nextInt();
            if (kilometros < 0)
                break; 
            System.out.printf("digite a quantidade de litros gastos: ");
            litros = input.nextInt();
            System.out.printf("A media de gasto foi %.2f kilometros por litro%n", (kilometros / (float) litros));
            totalKilometros += kilometros;
            totalLitros += litros;
            System.out.printf("Kilometros totais percorrido: %d%n", totalKilometros);
            System.out.printf("litros totais gasto: %d%n", totalLitros);
            System.out.printf("Media total: %.2f%n%n%n%n", (totalKilometros / (float) totalLitros));
        }
    }
}
