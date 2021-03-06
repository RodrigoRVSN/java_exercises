// Rodrigo Victor 200897
package ac1_poo_ex2;

public class Mesa {
	private int numero;
	private int quantidadeDePessoas;
	private double totalDaConta = 0;
	
	/* Construtor */
	public Mesa (int numero, int quantidadeDePessaos) {
		this.numero = numero;
		this.quantidadeDePessoas = quantidadeDePessaos;
		this.totalDaConta = 0;
	}
	
	/* Getters e setters */

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuantidadeDePessoas() {
		return quantidadeDePessoas;
	}
	public void setQuantidadeDePessoas(int quantidadeDePessoas) {
		this.quantidadeDePessoas = quantidadeDePessoas;
	}
	public double getTotalDaConta() {
		return totalDaConta;
	}
	public void setTotalDaConta(double totalDaConta) {
		this.totalDaConta = totalDaConta;
	}

	
	/* Retorna string com informacoes da mesa */
	public String print() {
		return "\nN?mero da mesa: " + this.getNumero() + "\nQuantidade de pessoas: " + this.getQuantidadeDePessoas() + "\nTotal da conta: R$ " + this.getTotalDaConta() + "\n---------------------";
	}
	
	/* Imprime o array do tipo de tabela chamada por par?metro (pedido ou pagamento) */
	public void printTabela(String tipoTabela[][]) {
		for(int i = 0; i < tipoTabela.length; i++) {
			System.out.print("\n");
			for(int secondIterator = 0; secondIterator < tipoTabela.length; secondIterator++) {
				System.out.print(" | " + tipoTabela[i][secondIterator]);
			}
		}
	}
	
	/* Faz o incremento no total da conta a partir do pedido */
	public void pedidoDeProdutos(int codigo, int quantidade) {
		switch(codigo) {
			case 1:
				this.setTotalDaConta(this.getTotalDaConta() + quantidade * 2);
				break;
			case 2:
				this.setTotalDaConta(this.getTotalDaConta() + quantidade * 5);
				break;
			case 3:
				this.setTotalDaConta(this.getTotalDaConta() + quantidade * 4);
				break;
		}
	}
	
	/* Fecha a conta com o desconto do tipo de pagamento */
	public void fechaContaComPagametno(int codigoPagamento) {
		switch(codigoPagamento) {
			case 1:
				this.setTotalDaConta(this.getTotalDaConta() * 0.9);
				break;
			case 3:
				this.setTotalDaConta(this.getTotalDaConta() * 0.95);
				break;
		}
	}
	
	/* Retorna quanto cada pessoa deve pagar do total da conta */
	public double calculaValorPorPessoa() {
		return getTotalDaConta() / getQuantidadeDePessoas();
	}
	
	
}
