import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao517 {

    private static final Scanner input = new Scanner(System.in);

    private static final NumberFormat formatoMonetario = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {

        String sentinela;

        Map<Integer, Integer> itens = new HashMap<>();

        do {

            System.out.printf("Entre com o item e a quantidade para contabilizar, ou \"sair\" para finalizar: ");
            sentinela = input.nextLine();

            try {
                int item = getItem(sentinela.split(" ")[0]);
                int quantidade = getQuantidade(sentinela.split(" ")[1]);

                if (itemValido(item)) {
                    int quantidadeAnterior = getQuantidadeAnterior(itens, item);
                    int quantidadeAtual = quantidadeAnterior + quantidade;
                    inserirItemQuantidade(itens, item, quantidadeAtual);
                } else {
                    System.out.println("Item invalido");
                }

            } catch (Exception e) {
                if (proximoItem(sentinela))
                    System.out.printf("Erro na leitura%n");
            }

        } while (proximoItem(sentinela));

        System.out.println();

        gerarRelatorio(itens);

    }

    private static int getItem(String item) throws NumberFormatException {
        return Integer.parseInt(item);
    }

    private static int getQuantidade(String quantidade) throws NumberFormatException {
        return Integer.parseInt(quantidade);
    }

    private static boolean itemValido(int item) {
        return item > 0 && item < 6;
    }

    private static int getQuantidadeAnterior(Map<Integer, Integer> itens, int item) {
        return itens.get(item) == null ? 0 : itens.get(item);
    }

    private static void inserirItemQuantidade(Map<Integer, Integer> itens, int item, int quantidade) {
        itens.put(item, quantidade);
    }

    private static boolean proximoItem(String sentinela) {
        return !sentinela.equals("sair");
    }

    private static void gerarRelatorio(Map<Integer, Integer> itens) {
        for (int item = 1; item <= itens.size(); item++) {
            int quantidade = itens.get(item);
            double valor = 0;
            switch (item) {
                case 1:
                    valor = quantidade * 2.98;
                    break;
                case 2:
                    valor = quantidade * 4.50;
                    break;
                case 3:
                    valor = quantidade * 9.98;
                    break;
                case 4:
                    valor = quantidade * 4.49;
                    break;
                case 5:
                    valor = quantidade * 6.87;
                    break;
            }
            imprimirQuantidadeValor(item, valor);
        }
    }

    private static void imprimirQuantidadeValor(int item, double valor) {
        System.out.printf("Item %-2d: %s%n", item, formatoMonetario.format(valor));
    }

}