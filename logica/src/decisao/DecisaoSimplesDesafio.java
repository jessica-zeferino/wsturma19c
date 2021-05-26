package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	
	/*
	 * Capture o nome de uma pessoa e a idade.
	 * De acordo com as leis eleitorais apresente uma das mensagens abaixo:
	 * 
	 * - seu voto é obrigatório
	 * - seu voto é facultativo
	 * - você não pode votar ainda
	 * 
	 */

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual é o seu nome? ");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Qual a sua idade? "));
		
		System.out.print(nome + ", ");
		
		if(idade>=18 && idade<=70) {
			
			System.out.println("seu voto é obrigatório, pois você tem " + idade + " anos.");
			
		}
		
		if(idade<16) {
			
			System.out.println("você não pode votar ainda, pois você tem " + idade + " anos.");
			
		}
		
		if((idade>=16 && idade<18) || (idade>70)) {
			
			System.out.println("seu voto é facultativo, pois você tem " + idade + " anos.");
			
		}
		
	}
	
}
