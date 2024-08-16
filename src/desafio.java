import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opc = 0;
        double saldo = 2500.00;
        System.out.println("""
                **********************************************
                Dados Iniciais do cliente
                
                Nome: Pedro de Lorenzo
                Tipo de Conta: Corrente
                Saldo Inicial: R$ 2500,00
                **********************************************
                """);
        while (opc != 4){
            System.out.println("""
                    Escolha uma das opcoes: 
                    1 - Ver saldo
                    2 - Depositar
                    3 - Transferencia
                    4 - Sair
                    """);
            opc = leitura.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Seu saldo é de: " + saldo);
                    break;
                case 2:
                    System.out.println("Quanto deseja depostar:");
                    double deposito = leitura.nextDouble();
                    saldo += deposito;
                    System.out.println("Seu saldo foi atualizado para: " + saldo);
                    break;
                case 3:
                    System.out.println("Quanto deseja transferir: ");
                    double transferencia = leitura.nextDouble();
                    saldo -= transferencia;
                    System.out.println("Seu saldo foi atualizado para: " + saldo);
                    break;
                case 4 :
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }

    }
}
