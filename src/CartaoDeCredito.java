import java.time.LocalDate;

public class CartaoDeCredito extends Cartao {
    private Float limite = 0.0F;
    private Float gasto = 0.0F;

    public CartaoDeCredito(String nome, LocalDate dataDeVencimento, String cvv, String numero, Float limite) {
        super(nome, dataDeVencimento, cvv, numero);
        this.limite = limite;
    }

    public boolean gastar(Float quantia){
        if(this.limite >= quantia){
            this.gasto += quantia;
            return true;
        }
        return false;
    }

    public  Float getLimiteAtual(){
        return  this.limite - this.gasto;
    }

    public Float getGasto(){
        return this.gasto;
    }

    public Float getLimiteTotal(){
        return this.limite;
    }

    public Float pagar(Float quantia){
        if(gasto < quantia){
            Float retorno = quantia - gasto;
            this.gasto = 0F;
            return retorno;
        }
        this.gasto = gasto - limite;
        return 0F;
    }
}
