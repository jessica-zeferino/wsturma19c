package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {
	
	/*
	 * Tipos primitivos (todos aqueles que come�am com letra min�scula)
	 * boolean => L�gico (true/false)
	 * char => �nico caracter entre apostrofos ('a') (pois "aspas" s�o reconhecidas como string)
	 * 
	 * byte => -127 at� +128
	 * short => -32mil at� +32mil
	 * int => -2tri at� +2tri
	 * long => -quintilh�es +quint
	 * 
	 * float => at� 5 casas decimais
	 * double => acima disso
	 */
	
	public static void main(String[] args) {
		
		String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
		int quantidadeProduto = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto:"));
		float valorUnitario = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do produto?"));
		float valorTotal = (valorUnitario * quantidadeProduto);
		float valorImposto = ((float) 0.17 * valorTotal); // cast => casting (ajuste de tamanho)
		
		
		System.out.println("Nome: " + nomeProduto);
		System.out.println("Valor total: " + valorTotal);
		System.out.println("Valor imposto: " + valorImposto);
		
		
	}

}
