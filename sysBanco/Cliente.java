package sysBanco;

public class Cliente {

    private String nome;
    private String sobrenome;
    private TipoConta tipoDeConta;
    private int cpf;

    public Cliente(String nome, String sobrenome, TipoConta tipoDeConta, int cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tipoDeConta = tipoDeConta;
        this.cpf = cpf;
    }

    public Cliente() {
        this.nome = null;
        this.sobrenome = null;
        this.tipoDeConta = null;
        this.cpf = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public TipoConta getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(TipoConta tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", sobrenome=" + sobrenome + ", tipoDeConta=" + tipoDeConta + ", cpf=" + cpf
                + "]";
    }

}
