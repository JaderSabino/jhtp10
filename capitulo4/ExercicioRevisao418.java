import java.util.Scanner;

public class ExercicioRevisao418 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.printf("Entre com os dados na seguinte ordem, separado por espaco.%n");
        System.out.printf("|numero da conta| |saldo inicial mes| |total itens cobrados mes| |total credito aplicado mes| |limite autorizado|.%n");

        String entrada = input.nextLine();

        int conta;
        int saldoMes;
        int totalCobradoMes;
        int totalCreditoMes;
        int limiteCliente;

        String dadosDecompostos[] = entrada.split(" ");
        
        try {
            conta = Integer.parseInt(dadosDecompostos[0]);
            saldoMes = Integer.parseInt(dadosDecompostos[1]);
            totalCobradoMes = Integer.parseInt(dadosDecompostos[2]);
            totalCreditoMes = Integer.parseInt(dadosDecompostos[3]);
            limiteCliente = Integer.parseInt(dadosDecompostos[4]);

            int novoSaldo = saldoMes + totalCobradoMes - totalCreditoMes;

            System.out.printf("novo saldo: %d", novoSaldo);
            
            if (novoSaldo > limiteCliente)
                System.out.printf("%nlimite de credito excedido");

        } catch (NumberFormatException e) {
            System.out.printf("Erro nos dados inseridos");
        }
    }
}
