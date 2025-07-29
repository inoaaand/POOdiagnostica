package sysBanco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaCorrente extends Conta {

    private double taxaTranferencia = 2.5;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na conta de: " + cliente.getNome());
    }

    @Override
    public void transferir(double valor, Conta destino) {
        try {
            double valorTotal = valor + taxaTranferencia;

            if (this.saldo >= valorTotal) {
                this.saldo -= valorTotal;
                destino.depositar(valor);

                LocalDateTime agora = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

                System.out.println("Transferência de R$" + valor + 
                                   " (Taxa R$" + taxaTranferencia + 
                                   ") realizada às: " + agora.format(formatter));
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao transferir: " + e.getMessage());
        }
    }

}
