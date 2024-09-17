public class Emprestimo extends Conta {
    protected double emp;

    //dados da cont do cliente
	public Emprestimo(Cliente cliente) {
        super(cliente);
    }

    public void emprestimo(double valor, IConta contaDestino){
        emp = valor;
        contaDestino.depositar(valor);     
    }    
    
    //+ soma do emprestimo
    @Override
	public void imprimirExtrato() {
        System.out.println("=== Extrato Emprestimo ===");
		System.out.println(String.format("Saldo: %.2f", this.emp));
	}
}
