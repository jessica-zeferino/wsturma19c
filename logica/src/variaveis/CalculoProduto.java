package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {
	
	/*
	 * Tipos primitivos (todos aqueles que começam com letra minúscula)
	 * boolean => Lógico (true/false)
	 * char => único caracter entre apostrofos ('a') (pois "aspas" são reconhecidas como string)
	 * 
	 * byte => -127 até +128
	 * short => -32mil até +32mil
	 * int => -2tri até +2tri
	 * long => -quintilhões +quint
	 * 
	 * float => até 5 casas decimais
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
