package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	/*
	 * Exercicio 2:
	 * Considere receber a quantidade de di?rias de um hotel e o valor da di?ria.
	 * Sobre a di?ria haver? uma taxa que depende da quantidade de di?rias.
	 * 
	 * Se a quantidade de di?rias for maior que 10 a taxa ser? de 5%
	 * Se a quantidade estiver entre 5 e 10 a taxa ser? de 8%
	 * Se a quantidade de diarias for menor que 5 a taxa ser? de 10%
	 * Exiba o valor final.
	 */
	
	public static void main(String[] args) {
		
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de di?rias: "));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da di?ria?"));
		float valorTotal;
		
		if (diarias>10) {
			valorTotal = diarias*valor*(float)1.05;
			System.out.println(valorTotal);
		}
		else if (diarias < 10 && diarias > 5) {
			valorTotal = diarias*valor*(float)1.08;
			System.out.println(valorTotal);
		}
		else if (diarias < 5) {
			valorTotal = diarias*valor*(float)1.10;
			System.out.println(valorTotal);
		}
		
		//prinf -> n?o usa '+' para concatenar, usa ','
		// al?m disso, onde colocamos o "%f" ? onde a vari?vel ser? alocada
		//%.2f (.2 controlamos a quantidade de casas decimais)
		
	}
	
}
