//Classe contaBancaria da atividade 04
public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    double depositar(double valor) {
        saldo += valor;
        return saldo;
    }

    double sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
        return saldo;
    }

    void consultarSaldo() {
        System.out.println("Saldo atual R$ " +saldo);
    }
}
