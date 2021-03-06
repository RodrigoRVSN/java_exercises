// Rodrigo Victor 200897
package ac1_poo_ex2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AppRestaurante {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continuar = true;
		
		String produtos[][] = {
				{"1", "Refrigerante", "R$ 2,00"},
				{"2", "Cachorro Quente", "R$ 5,00"},
				{"3", "Batata Frita", "R$ 4,00"},
		};
		
		String pagamentos[][] = {
				{"1", "Dinheiro", "10% de desconto"},
				{"2", "Cheque", "Sem desconto"},
				{"3", "Cart?o", "5% de desconto"},
		};

		/* ---------------------------- MESA 1 ----------------------------  */
		
		Mesa mesa1 = new Mesa(1, 5);		

		// Pedidos
		System.out.println("---------------------------- Mesa 1 ----------------------------");
		mesa1.printTabela(produtos);

		// while feito para pedir em loop o codigo e quantidade de itens
		while(continuar == true) {
			System.out.println("\n\nDigite o c?digo do produto e sua quantidade (0 para interromper): ");
			int codigo = input.nextInt();
			int quantidade = input.nextInt();

			// se for digitado 0, ele interrompe o loop e para de gerar input de pedidos
			if(quantidade == 0 || codigo == 0) {
				continuar = false;
				break;
			}
			
			mesa1.pedidoDeProdutos(codigo, quantidade);
		}
		
		// Pagamentos

		mesa1.printTabela(pagamentos);
		System.out.println("\n\nDigite o c?digo do tipo de pagamento: ");
		mesa1.fechaContaComPagametno(input.nextInt());
		double valorPorPessoa1 = mesa1.calculaValorPorPessoa(); 

		/* ---------------------------- MESA 2 ---------------------------- */

		Mesa mesa2 = new Mesa(2, 3);		

		// Pedidos
		System.out.println("\n\n---------------------------- Mesa 2 ----------------------------");
		mesa2.printTabela(produtos);
		continuar = true;
		
		// while feito para pedir em loop o codigo e quantidade de itens
		while(continuar == true) {
			System.out.println("\n\nDigite o c?digo do produto e sua quantidade (0 para interromper): ");
			int codigo = input.nextInt();
			int quantidade = input.nextInt();
			
			// se for digitado 0, ele interrompe o loop e para de gerar input de pedidos
			if(quantidade == 0 || codigo == 0) {
				continuar = false;
				break;
			}
			
			mesa2.pedidoDeProdutos(codigo, quantidade);
		}
		
		// Pagamentos

		mesa2.printTabela(pagamentos);
		System.out.println("\n\nDigite o c?digo do tipo de pagamento: ");
		mesa2.fechaContaComPagametno(input.nextInt());
		double valorPorPessoa2 = mesa2.calculaValorPorPessoa(); 
		
		/* ---------------------------- GERAL ---------------------------- */
		
		// Imprimir todas as mesas
		System.out.println("\n\n---------------------------- GERAL ----------------------------");
		System.out.println("\nA mesa " + mesa1.getNumero() + " deve pagar por pessoa R$ " + new DecimalFormat("#,##0.00").format(valorPorPessoa1));
		System.out.println(mesa1.print());
		System.out.println("\nA mesa " + mesa2.getNumero() + " deve pagar por pessoa R$ " + new DecimalFormat("#,##0.00").format(valorPorPessoa2));
		System.out.println(mesa2.print());
		
		
		// Imprimir a mesa com o maior valor gasto por pessoa
		System.out.println("\nA mesa com maior valor gasto por pessoa ? a mesa " + ((valorPorPessoa1 > valorPorPessoa2) ? mesa1.getNumero() : mesa2.getNumero()));
		
		
		input.close();
	}

}
