package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	/*
	 * 1) Solicite 2 valores e um operador matem?tico
	 * (+, -, /, *)
	 * 
	 * Dependendo do operador que foi digitado, realize o c?lculo e exiba o resultado.
	 * Dica: Se utilizar String a compara??o de String deve ser:
	 * if (variavel.equals("valorasercomparado"))
	 * 
	 */
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1? valor: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2? valor: "));
		char operador = JOptionPane.showInputDialog("Ecolha um operador (+, -, /, *): ").charAt(0);
				
		if(operador=='+') {
			System.out.println(x+y);
		}else if (operador=='-'){
			System.out.println(x-y);
		}else if (operador=='/'){
			System.out.println(x/y);
		}else{
			System.out.println(x*y);
		}
		
	}

}
