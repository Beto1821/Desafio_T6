import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "ANA";
        double saldo = 0.00;
        int opcao = 0;

        System.out.println("******************************");
        System.out.println("\nNome do Cliente:  " + nome);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n******************************");

        String menu = """
                \nDigite sua opção:
                
                1 - Consultar Saldo
                2 - Valor retirada
                3 - Valor deposito
                4 - Sair
                
                Digite sua opção:""";
        Scanner input = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Seu Saldo é de " + saldo);
            }

            if (opcao == 2) {
                System.out.println("Digite valor de para retirada");
                double valorRetirada = input.nextDouble();
                if (valorRetirada > saldo) {
                    System.out.println("Saldo insuficiente para realizar esta operação");
                } else {
                    saldo -= valorRetirada;
                    System.out.println("Valor retirado com Sucesso. Saldo Atual: " + saldo);
                }

            }
            if (opcao ==3) {
                System.out.println("Digite valor para ser depositado");
                double valorDeposito = input.nextDouble();
                saldo += valorDeposito;
                System.out.println("Valor depositado com sucesso o seu Saldo atual é de " + saldo);
            }
        }
        input.close();   
    }
}

