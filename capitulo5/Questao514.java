import java.text.NumberFormat;

public class Questao514 {
    
    private static final NumberFormat percenteFormat = NumberFormat.getPercentInstance();
    
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        double rate = 0.05;

        for (int i = 1; i <= 6; ++i) {
            System.out.printf("%s%20s %s%n", "Year", "Amount on deposit", percenteFormat.format(rate));

            for (int year = 1; year <= 10; ++year) {
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }

            System.out.println();

            rate += 0.01;
        }
    }
}