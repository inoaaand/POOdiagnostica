package sysBanco;

public class Main {

    public static void main(String[] args) {
        Banco banco = databaseBanco();
        Cliente cliente = new Cliente("Fernanda", "Silverio", TipoConta.CORRENTE, 123456789);
        Cliente cliente2 = new Cliente("Raphael", "Veiga", TipoConta.CORRENTE, 987654321);

        banco.adicionarCliente(cliente);
        banco.adicionarCliente(cliente2);

        Conta contaCc = new ContaCorrente(cliente);
        Conta contaPp = new ContaPoupanca(cliente2);

        banco.adicionarConta(contaCc);
        banco.adicionarConta(contaPp);

        banco.listarContas();
        System.out.println("\n");
        contaPp.depositar(2500);
        contaCc.depositar(1000);
        contaPp.transferir(300, contaCc);
        System.out.println("\n");

        banco.listarContas();

    }

    private static Banco databaseBanco() {
        Banco banco = new Banco();
        banco.setNome("Sicredi");
        banco.setCidade("Cascavel");

        return banco;
    }
}
