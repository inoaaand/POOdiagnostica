package sysBanco;

import java.util.ArrayList;

public class Banco {
    
    private String nome;
    private String cidade;
    private ArrayList<Conta> contas = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();


    public Banco(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public Banco() {
        this.nome = null;
        this.cidade = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
