//Classe principal da classe ContaBancaria
//Atividade 04
import java.util.Scanner;
public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria(); // Instanciando o objeto conta1
        conta1.numeroConta = "12345-6";
        conta1.titular = "David Lago";
        conta1.saldo = 1000;

        ContaBancaria conta2 = new ContaBancaria(); // Instanciando o objeto conta2
        conta2.numeroConta = "65432-1";
        conta2.titular = "Gabriel Oliveira";
        conta2.saldo = 5003;

        System.out.println("==================================");

        System.out.println("Dados da conta 1:");
        System.out.println("Nome do titular: "+ conta1.titular);
        System.out.println("Numero da conta: " + conta1.numeroConta);
        conta1.consultarSaldo();

        System.out.println("=============Depósito=============");
        System.out.println("Digite o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        conta1.depositar(valorDeposito);
        System.out.println("Novo saldo após depósito: " + conta1.saldo);

        System.out.println("===============Saque==============");
        System.out.println("Digite o valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta1.sacar(valorSaque);
        System.out.println("Novo saldo após o saque: " + conta1.saldo);

        System.out.println("=========Consultar Saldo==========");
        conta1.consultarSaldo();
    }
}
