import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nomeCliente = "Luiz Paulo Silva";
        String tipoConta = "Conta Poupança";
        double saldo = 2500.99;
        int opcao = 0;

        System.out.println("####################################");
        System.out.println("\nNome do Cliente " + nomeCliente);
        System.out.println("Tipo de Conta " + tipoConta);
        System.out.println("Saldo da Conta " + saldo);
        System.out.println("\n####################################");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Pix
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O Seu saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo disponível para essa tranferência!");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo disponível é " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("Novo saldo disponível é " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            } else if (opcao == 4) {
                System.out.println("Obrigado por utilizar o nosso apps! =) ");
            }

        }
    }
}
