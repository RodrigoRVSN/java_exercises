/*
 * Rodrigo Victor 200897
 */

package ac1_p2;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Mesa {
    private int numero, qtdPessoas;
    private double totalConta, valorPessoa;
    private boolean sendoUsada;

    /* CONSTRUTOR LIMPO */
    public Mesa() {
        setNumero(0);
        setQtdPessoas(0);
        setTotalConta(0);
        setValorPessoa(0);
    }

    /* GETTERS AND SETTERS */

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public double getTotalConta() {
        return totalConta;
    }

    public void setTotalConta(double totalConta) {
        this.totalConta = totalConta;
    }

    public double getValorPessoa() {
        return valorPessoa;
    }

    public void setValorPessoa(double valorPessoa) {
        this.valorPessoa = valorPessoa;
    }

    public boolean isSendoUsada() {
        return sendoUsada;
    }

    public void setSendoUsada(boolean sendoUsada) {
        this.sendoUsada = sendoUsada;
    }

    /* Calculo do valor total do pedido */
    public void pedidoProdutos() {
        double valorConta = 0;
        JOptionPane.showMessageDialog(null, "\n1 - Refrigerante - R$ 2,00\n2 - Cachorro Quente - R$ 5,00\n3 - Batata Frita - R$ 4,00", "PEDIDOS", JOptionPane.INFORMATION_MESSAGE);

        int cod = Integer.parseInt(JOptionPane.showInputDialog("\n1 - Refrigerante - R$ 2,00\n2 - Cachorro Quente - R$ 5,00\n3 - Batata Frita - R$ 4,00\n\nDigite o codigo do item. "));
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens. "));

        if (cod == 1) {
            valorConta = qtd * 2.00;
        } else if (cod == 2) {
            valorConta = qtd * 5.00;
        } else if (cod == 3) {
            valorConta = qtd * 4.00;
        } else {
            JOptionPane.showMessageDialog(null, "\nEste pedido nao existe!\nInsira um codigo de 1 a 3.", "ATENCAO", JOptionPane.WARNING_MESSAGE);
        }

        setTotalConta(valorConta + getTotalConta());
    }

    // Calculo do pagamento e descontos
    public void pagamento(int idMesa) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        int op;
        double totalLiquido, valorPessoa;

        int metodo = Integer.parseInt(JOptionPane.showInputDialog("\nFormas de pagamento: \n1 - Dinheiro\n2 - Cheque\n3 - Cartao\n\nDigite a opcao de pagamento: "));

        if (metodo == 1) {
            totalLiquido = getTotalConta() - (getTotalConta() * 0.1);
        } else if (metodo == 2) {
            totalLiquido = getTotalConta();
        } else if (metodo == 3) {
            totalLiquido = getTotalConta() - (getTotalConta() * 0.05);
        } else {
            totalLiquido = getTotalConta();
        }

        // Calculo do valor a ser pago por pessoa
        valorPessoa = totalLiquido / getQtdPessoas();

        JOptionPane.showMessageDialog(null, "\nValor total liquido: R$ " + df.format(totalLiquido) + "\nValor por pessoa: R$ " + df.format(valorPessoa), "PAGAMENTOS - CHECKOUT MESA " + idMesa, JOptionPane.INFORMATION_MESSAGE);

        // É necessário passar como parâmetro para realizar a busca da mesa com o maior valor por pessoa 
        setTotalConta(totalLiquido);
        setValorPessoa(valorPessoa);
    }

    // Imprimir dados da mesa 
    public String printMesa() {
        String data;

        data = "\nNumero da mesa: " + getNumero() +
                "\nQuantidade de pessoas: " + getQtdPessoas() +
                "\nValor total: R$ " + getTotalConta() +
                "\nValor por pessoa: R$ " + getValorPessoa();

        return data;
    }
}
