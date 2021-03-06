package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	/*
	 * Exercicio 3:
	 * Receba o valor do sal?rio bruto, o nome de um colaborador e a qtde de faltas.
	 * Se n?o houver faltas o salario bruto receber? um aumento de 2%.
	 * 
	 * Calcule o valor do INSS sobre o sal?rio bruto.
	 * Exiba no final o sal?rio bruto, e o sal?rio liquido (retirando o INSS e 8% do FGTS)
	 */
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do colaborador: ").toUpperCase();
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Qual o sal?rio do colaborador? "));
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de faltas: "));
		float liquido;
		
		if (faltas==0) {
			salario = salario * (float)1.02;
		}
		
		/*
		 * At? R$ 1.100	7,5%
		De R$ 1.100,01 a R$ 2.203,48	9%
		De R$ 2.203,49 at? R$ 3.305,22	12%
		De R$ 3.305,23 at? R$ 6.433,57	14%
		 */
		
		if(salario<=1100) {
			liquido = salario - (salario*(float)0.08) - (salario*(float)0.075);
		}else if(salario>=1100.01 && salario<=2203.48) {
			liquido = salario - (salario*(float)0.08) - (salario*(float)0.09);
		}else if(salario>=2203.49 && salario<=3305.22) {
			liquido = salario - (salario*(float)0.08) - (salario*(float)0.12);
		}else {
			liquido = salario - (salario*(float)0.08) - (salario*(float)0.14);
		}
		
		
		System.out.println("Ol?, " + nome + " . Seu sal?rio ?: ");
		System.out.println("Sal?rio bruto: " + salario);
		System.out.println("Sal?rio l?quido: " + liquido);
		
	}
	
}
