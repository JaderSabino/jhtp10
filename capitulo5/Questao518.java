import java.text.NumberFormat;

public class Questao518 {

    private static final NumberFormat percenteFormat = NumberFormat.getPercentInstance();

    public static void main(String[] args) {
        System.out.println("\nRelatorio com numeros de ponto flutuante\n");
        relatorioDouble(); 
        System.out.println("\nRelatorio com numeros inteiro\n");
        relatorioInteiro();
    }

    public static void relatorioDouble() {
        double amount;
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s %s%n", "Year", "Amount on deposit", percenteFormat.format(rate / 100.0));

        for (int year = 1; year <= 10; ++year) {
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }

        System.out.println();
    }

    public static void relatorioInteiro() {
        int amount = 100_000;
        int rate = 5;

        System.out.printf("%s%20s %s%n", "Year", "Amount on deposit", percenteFormat.format(rate / 100.0));

        for (int year = 1; year <= 10; ++year) {
            amount += (amount / 100.0) * rate;
            System.out.printf("%4d%,20d,%02d%n", year, amount / 100, Math.round(amount % 100));
        }

        System.out.println();
    }

    public static int pow(int a, int b) {
        if (b == 0)
            return 1;
        for (int i = 0; i < b; i++) {
            a *= a;
        }
        return a;
    }
}