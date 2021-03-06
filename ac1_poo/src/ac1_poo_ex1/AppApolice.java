// Rodrigo Victor 200897
package ac1_poo_ex1;
import java.util.Scanner;

public class AppApolice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/* ---------------------------- APOLICE 1 ---------------------------- */
		
		Apolice apolice1 = new Apolice("Giulia", 32, 100);
		
		System.out.println("1) -----------------------------------\n\n" + apolice1.print());
		
		apolice1.calculaValorPremio();
		System.out.println("\nCom valor do pr?mio atualizado com acr?scimo:\n" + apolice1.print());
		
		System.out.println("\n- Digite o nome da cidade: ");
		String cidade1 = input.nextLine();
		apolice1.calculaDescontoPremio(cidade1);
		System.out.println("\nCom valor do pr?mio atualizado com desconto:\n" + apolice1.print() + "\n\n");

		/* ---------------------------- APOLICE 2 ---------------------------- */
		
		Apolice apolice2 = new Apolice();

		System.out.println("2) -----------------------------------\n\n" + apolice2.print());
		
		apolice2.calculaValorPremio();
		System.out.println("\nCom valor do pr?mio atualizado com acr?scimo:\n" + apolice2.print());
		
		System.out.println("\n- Digite o nome da cidade: ");
		String cidade2 = input.nextLine();
		apolice2.calculaDescontoPremio(cidade2);
		System.out.println("\nCom valor do pr?mio atualizado com desconto:\n" + apolice2.print() + "\n\n");
		
		input.close();
	}

}
