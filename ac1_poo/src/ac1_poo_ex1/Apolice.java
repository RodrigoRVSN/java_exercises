// Rodrigo Victor 200897
package ac1_poo_ex1;
import java.text.DecimalFormat;

public class Apolice {
	private String nomeSegurado;
	private int idade;
	private double valorPremio;

	/* Construtores */
	public Apolice(){
		this.nomeSegurado = "Rodrigo Victor";
		this.idade =  20;
		this.valorPremio = 1000;
	}
	
	public Apolice(String nomeSegurado, int idade, double valorPremio) {
		this.nomeSegurado = nomeSegurado;
		this.idade = idade;
		this.valorPremio = valorPremio;
	}
	
	/* Getters e setters */
	public String getNomeSegurado() {
		return nomeSegurado;
	}

	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getValorPremio() {
		return valorPremio;
	}

	public void setValorPremio(double valorPremio) {
		this.valorPremio = valorPremio;
	}

	/* Imprime os dados */
	public String print() {
		return "Dados da ap?lice do(a) " + getNomeSegurado() + ": \nNome segurado: " + this.getNomeSegurado() + "\nIdade: " + this.getIdade() + "\nValor pr?mio: " + new DecimalFormat("#,##0.00").format(this.getValorPremio());
	}
	
	/* Calcula valor do premio de acordo com a idade */
	public void calculaValorPremio() {
		int idade = this.getIdade();
		if(idade >= 18 && idade <= 25) {
			this.setValorPremio(this.getValorPremio() * 1.2);
		} else if (idade > 25 && idade <= 36) {
			this.setValorPremio(this.getValorPremio() * 1.15);
		} else if(idade > 36) {
			this.setValorPremio(this.getValorPremio() * 1.1);
		} 
	}
	

	/* Calcula valor descontado do premio de acordo com o local */
	public void calculaDescontoPremio(String cidade) {
		switch(cidade) {
			case "Curitiba":
				this.setValorPremio(this.getValorPremio() * 0.8);
				break;
			case "Rio de Janeiro":
				this.setValorPremio(this.getValorPremio() * 0.85);
				break;
			case "S?o Paulo":
				this.setValorPremio(this.getValorPremio() * 0.9);
				break;
			case "Belo Horizonte":
				this.setValorPremio(this.getValorPremio() * 0.95);
				break;
		}
	}
}
