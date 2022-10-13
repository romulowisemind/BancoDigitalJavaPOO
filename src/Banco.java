import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    private List<QualBanco> bancos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<QualBanco> getBancos() {
        return bancos;
    }

    public void setBancos(List<QualBanco> bancos) {
        this.bancos = bancos;
    }
}
