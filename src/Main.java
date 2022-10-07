import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Cartao cartaoDeCredito = new CartaoDeCredito(venilton.getNome(), LocalDate.now().plusDays(900000000),"967","9000",30F);
		
		Conta cc = new ContaCorrente(venilton,cartaoDeCredito);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
