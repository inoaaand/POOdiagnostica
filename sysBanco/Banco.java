package sysBanco;

public class Banco {

    private String nome;
    private int CNPJ;
    private String cidade;


    public Banco(String nome, int cNPJ, String cidade) {
        this.nome = nome;
        CNPJ = cNPJ;
        this.cidade = cidade;
    }

    public Banco() {
        this.nome = null;
        CNPJ = 0;
        this.cidade = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int cNPJ) {
        CNPJ = cNPJ;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Banco [nome=" + nome + ", CNPJ=" + CNPJ + ", cidade=" + cidade + "]";
    }

}
