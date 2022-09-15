public class Questao513 {
    public static void main(String[] args) {
        long fatorial = 1;
        for (int i = 1; i <= 20; i++) 
                System.out.printf("%5d %d%n", i, fatorial *= i);
    }
}