public class Questao512 {
    public static void main(String[] args) {
        int produto = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0)
                produto *= i;
        }
        System.out.printf("O produto dos numeros impares de 1 a 15 is %d", produto);
    }
}