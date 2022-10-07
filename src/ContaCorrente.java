
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, Cartao cartao) {
		super(cliente, cartao);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
