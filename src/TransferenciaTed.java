public class TransferenciaTed extends Conta {
    protected double emp;

    //dados da cont do cliente
	public TransferenciaTed(Cliente cliente) {
        super(cliente);
    }

    public void emprestimo(double valor, IConta contaDestino){
        emp = valor;
        contaDestino.depositar(valor);     
    }    
    
    //+ soma do emprestimo
    @Override
	public void imprimirExtrato() {
        System.out.println("=== Transferência via TED ===");
		System.out.println(String.format("Saldo: %.2f", this.emp));
	}
}
