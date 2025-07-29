package sysBanco;


public class Main {

    public static void main(String[] args) {
        Banco banco = databaseBanco();
        Cliente cliente = new Cliente("FERNADNA", "S", TipoConta.CORRENTE, 123456789);
        Cliente cliente2 = new Cliente("Rhapeal", "Veiga",TipoConta.CORRENTE, 987654321);


    
    
        Conta conta = new Conta();

        conta.transferir(125, conta);
    
        conta.depositar(1000);
      
      
    }

    private static Banco databaseBanco() {
        Banco banco = new Banco();
        banco.setNome("Sicredi");
        banco.setCNPJ(123456789);
        banco.setCidade("Cascavel");

        return banco;
    }
}
