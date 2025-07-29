package sysBanco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conta {

    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void transferir(double valor, Conta destino) {
        try {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                destino.depositar(valor);

                LocalDateTime agora = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

                System.out.println("Transferência de R$" + valor +" realizada às: " + agora.format(formatter));
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao transferir: " + e.getMessage());
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Conta de " + cliente.getNome() + " | Saldo: R$" + saldo;
    }
}
