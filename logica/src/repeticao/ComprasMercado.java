package repeticao;

import javax.swing.JOptionPane;

public class ComprasMercado {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome");
		String email = JOptionPane.showInputDialog("Email");
		int qtd = 0;
		double total = 0;
		double resumo = 0;
		
		while(JOptionPane.showConfirmDialog
				(null, "Deseja adicionar itens ? sua compra?", "T?tulo", JOptionPane.YES_NO_OPTION)==0) {
			String nomeProduto = JOptionPane.showInputDialog("Nome do produto");
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto"));
			qtd = Integer.parseInt(JOptionPane.showInputDialog("Qtd do produto"));
			
			total = valor*qtd;
			
			System.out.println("Produto: " + nomeProduto + "\n Valor: " + total);
			
			resumo+=total;
			
			System.out.println(nome + ", o valor total da compra ?: " + resumo);
		}
		
	}
	
}
