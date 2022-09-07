import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioRevisao420 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        List<Funcionario> funcionarios = new ArrayList<>();
        
        while(true) {

            System.out.printf("Digite 0 para finalizar o programa ou entre com os dados do funcionario da seguinte forma.%n");
            System.out.printf("|Nome| |Horas trabalhadas| |Valor hora|.%n");

            String entrada = input.nextLine();

            if (entrada.equals("0"))
                break;
            
            String dadosDecompostos[] = entrada.split(" ");

            if (dadosDecompostos.length != 3) {
                System.out.printf("%n%nDados incorretos. Favor insera novamente.%n%n");
                continue;
            }

            try {
                funcionarios.add(Funcionario.newFuncionario(dadosDecompostos[0], Double.parseDouble(dadosDecompostos[1]), Double.parseDouble(dadosDecompostos[2])));
                System.out.printf("%nfuncionario inserido com sucesso.%n%n");
            } catch (NumberFormatException e) {
                System.out.printf("%n%nErro nos dados inseridos. Insira novamente.%n%n");
            }

        }

       for (Funcionario funcionario : funcionarios) {
        imprimirRelatorioFuncionario(funcionario);
       }
        
    }

    public static void imprimirRelatorioFuncionario(Funcionario funcionario) {
        
        double horasExtras = 0;
        double valorReceberHorasNormais = 0;
        double valorReceberHorasExtra = 0;
        NumberFormat formatarValor = NumberFormat.getCurrencyInstance();
        
        if (funcionario.horasTrabalhadas > 40) {
            horasExtras = funcionario.horasTrabalhadas - 40;
            valorReceberHorasNormais = 40 * funcionario.valorHora;
            valorReceberHorasExtra = horasExtras * ( (funcionario.valorHora * (50/100.0)) + funcionario.valorHora);
        } else {
            valorReceberHorasNormais = funcionario.horasTrabalhadas * funcionario.valorHora;
        }
            
        System.out.printf("funcionario %s recebera %s%n", funcionario.nome, formatarValor.format(valorReceberHorasNormais + valorReceberHorasExtra));        

    }

    private static class Funcionario {
        String nome;
        double horasTrabalhadas;
        double valorHora;

        private Funcionario(String nome, double horasTrabalhadas, double valorHora) {
            this.nome = nome;
            this.horasTrabalhadas = horasTrabalhadas;
            this.valorHora = valorHora;
        }

        public static Funcionario newFuncionario(String nome, double horasTrabalhadas, double valorHora) {
            return new Funcionario(nome, horasTrabalhadas, valorHora);
        }

        public String toString() {
            StringBuilder string = new StringBuilder();
            
            string
            .append("nome: ")
            .append(nome)
            .append(" - ")
            .append("horas trabalhadas: ")
            .append(horasTrabalhadas)
            .append(" - ")
            .append("valor hora: ")
            .append(valorHora);
            
            return string.toString();
        }
    }
}
