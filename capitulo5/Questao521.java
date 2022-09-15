public class Questao521 {

    public static void main(String[] args) {

        int indiceTabela = 0;

        System.out.printf("%10s%10s%10s%10s%n", "Ordem", "a", "b", "c");

        for (int a = 1; a <= 500; a++) {
            for (int b = a; b <= 500; b++) {
                for (int c = 1; c <= 500; c++) {
                    if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) && (a % 2 != 0 || b % 2 != 0))
                        System.out.printf("%10d%10d%10d%10d%n", ++indiceTabela, a, b, c);
                }
            }
        }

    }
}