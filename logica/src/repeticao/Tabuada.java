package repeticao;

import javax.swing.JOptionPane;

public class Tabuada {
	
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero e veja a tabuada"));
		int contador = 0;
		
		do {
			System.out.println(i + "x" + contador + " = " + i*contador);
			contador++;
		}while(contador<101);
		
		
	}
}
