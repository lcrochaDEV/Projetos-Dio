
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Emprestimo emprestimo = new Emprestimo(venilton);
		emprestimo.emprestimo(1000, cc);
		emprestimo.imprimirExtrato();
		cc.imprimirExtrato();
	//------------------------------------------------//

		Cliente Lucas = new Cliente();
		Lucas.setNome("Lucas");
		
		Conta cc01 = new ContaCorrente(Lucas);
		Conta poupanca01 = new ContaPoupanca(Lucas);

		cc01.depositar(1000);
		cc01.transferir(100, poupanca01);
		
		cc01.imprimirExtrato();
		poupanca01.imprimirExtrato();

		Emprestimo Ted = new Emprestimo(Lucas);
		Ted.emprestimo(800, cc);
		Ted.imprimirExtrato();
		cc.imprimirExtrato();

	}

}
