/*
 * Rodrigo Victor 200897
 */

package ac1_p2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class appMain {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int quantidadeDeMesas = 30;

        // Inicializando todas as mesas
        Mesa mesa[] = new Mesa[quantidadeDeMesas + 1];
        for (int j = 1; j < quantidadeDeMesas + 1; j++) {
            mesa[j] = new Mesa();
        }
        int i = 0, a, id, qtdPessoas;

        JOptionPane.showMessageDialog(null, "Olá :)\nPossuimos " + quantidadeDeMesas + " mesas.", "Seja bem vindo ao prato feito!", JOptionPane.INFORMATION_MESSAGE);

        boolean continuar = true;
        // Cadastrando as mesas
        while (continuar) {
            id = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de identificação da nova mesa "));
            if (id <= quantidadeDeMesas && id > 0) {

                if (!mesa[id].isSendoUsada()) {
                    mesa[id].setNumero(id);
                    mesa[id].setSendoUsada(true);
                    qtdPessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de pessoas da mesa " + id));
                    mesa[id].setNumero(id);
                    mesa[id].setQtdPessoas(qtdPessoas);
                } else {
                    JOptionPane.showMessageDialog(null, "Esta mesa ja esta sendo usada", "ATENCAO", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Esta mesa nao esta disponivel", "ATENCAO", JOptionPane.WARNING_MESSAGE);


            }
            int opcaoContinuarMesa = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir uma nova mesa?\n\nQualquer numero para continuar\n0 para encerrar"));
            if (opcaoContinuarMesa == 0) {
                continuar = false;
            }
        }

        // Imprimindo todas as mesas que estao sendo usadas.
        for (a = 1; a < quantidadeDeMesas + 1; a++) {
            if (mesa[a].isSendoUsada()) {
                JOptionPane.showMessageDialog(null, mesa[a].printMesa(), "Resumo", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        i = 0;
        a = 0;


        boolean continuarPedidos = true;

        // Efetuar   Pedidos-Cada   mesa   pode   efetuar   vários   pedidos (questione se os clientes da mesa desejam fazer mais pedidos (s/n));
        // Efetuando dois pedidos por cada mesa
        while (continuarPedidos) {
            int idPedido = Integer.parseInt(JOptionPane.showInputDialog("Digite a mesa na qual voce quer fazer o pedido. "));
            if (idPedido <= quantidadeDeMesas && idPedido > 0) {

                if (mesa[idPedido].isSendoUsada()) {
                    mesa[idPedido].pedidoProdutos();
                } else {
                    JOptionPane.showMessageDialog(null, "A mesa " + idPedido + " nao tem ninguem.", "ATENCAO", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "A mesa " + idPedido + " nao esta disponivel.", "ATENCAO", JOptionPane.WARNING_MESSAGE);


            }
            int opcaoContinuarPedido = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer um novo pedido?\n\nQualquer numero para continuar\n0 para encerrar"));
            if (opcaoContinuarPedido == 0) {
                continuarPedidos = false;
            }
        }

        i = 0;

        // Calculando e imprimindo o valor final da conta e por pessoa

        for (a = 1; a < quantidadeDeMesas + 1; a++) {
            if (mesa[a].isSendoUsada()) {
                mesa[a].pagamento(a);
            }
        }


        // Encontrando o maior valor por pessoa e imprimindo a mesa que possui com este valor
        for (a = 1; a < quantidadeDeMesas + 1; a++) {
            if (mesa[a].isSendoUsada()) {
                JOptionPane.showMessageDialog(null, mesa[a].printMesa(), "RESUMO FINAL", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
