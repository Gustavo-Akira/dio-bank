import java.time.LocalDate;

public class CartaoDeDebito extends Cartao{
    public CartaoDeDebito(String nome, LocalDate dataDeVencimento, String cvv, String numero) {
        super(nome, dataDeVencimento, cvv, numero);
    }
}
