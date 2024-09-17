public class TransferenciaTed extends Conta {
    protected double ted;
    protected String beneficiadoName;

    //dados da cont do cliente
	public TransferenciaTed(Cliente cliente) {
        super(cliente);
    }

    public void ted(double valor, IConta contaDestino, String beneficiado){
        ted = valor;
        beneficiadoName = beneficiado;
        contaDestino.depositar(valor);
    }    
    
    //+ soma do tedrestimo
    @Override
	public void imprimirExtrato() {
        System.out.println("=== Transferência via TED de " + cliente.getNome() + " para " + beneficiadoName + " ===");
		System.out.println(String.format("Valor: %.2f", this.ted));
	}
}
