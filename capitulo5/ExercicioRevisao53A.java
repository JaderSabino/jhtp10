public class ExercicioRevisao53A {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        for (count = 1; count < 100; count++) {
            if (count % 2 != 0)
                sum += count;
        }

        System.out.printf("A soma dos numeros impares is %d", sum);
    }
}
