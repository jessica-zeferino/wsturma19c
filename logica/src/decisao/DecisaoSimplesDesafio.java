package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	
	/*
	 * Capture o nome de uma pessoa e a idade.
	 * De acordo com as leis eleitorais apresente uma das mensagens abaixo:
	 * 
	 * - seu voto � obrigat�rio
	 * - seu voto � facultativo
	 * - voc� n�o pode votar ainda
	 * 
	 */

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual � o seu nome? ");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Qual a sua idade? "));
		
		System.out.print(nome + ", ");
		
		if(idade>=18 && idade<=70) {
			
			System.out.println("seu voto � obrigat�rio, pois voc� tem " + idade + " anos.");
			
		}
		
		if(idade<16) {
			
			System.out.println("voc� n�o pode votar ainda, pois voc� tem " + idade + " anos.");
			
		}
		
		if((idade>=16 && idade<18) || (idade>70)) {
			
			System.out.println("seu voto � facultativo, pois voc� tem " + idade + " anos.");
			
		}
		
	}
	
}
