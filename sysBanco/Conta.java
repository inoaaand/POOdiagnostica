package sysBanco;

import java.text.DateFormat;
import java.util.ArrayList;

public class Conta {
// Sistema bancário simples: O sistema simula a lógica de uma instituição bancária. Cada
// cliente possui uma ou mais contas (que pode ser corrente ou poupança), podendo realizar
// operações como depósito, saque e transferência. A entidade banco gerencia um conjunto de
// contas e clientes, centralizando a criação e o controle de dados.
    //me manda tudo chat
private TipoConta tipo; //usa isso? 
    protected double saldo = 0;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta destino) {
        
        try {
            if (this.saldo >= valor) {
                this.sacar(valor);            
                destino.depositar(valor);  
            System.out.println("DEPOSTIO REALIZADO AS: " + );
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Saldo insuficiente para transferência.");
            
        }
    
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

      public void printContas(ArrayList<Cliente> contas) {
        for (Cliente cliente : contas) {
           System.out.println(cliente);
        }


}
}
