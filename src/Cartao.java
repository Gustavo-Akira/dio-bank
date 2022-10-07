import java.time.LocalDate;

public abstract class Cartao {
    protected String nome;
    protected LocalDate dataDeVencimento;
    protected String cvv;
    protected String numero;

    public Cartao(String nome, LocalDate dataDeVencimento, String cvv, String numero){
        this.cvv = cvv;
        this.nome = nome;
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
