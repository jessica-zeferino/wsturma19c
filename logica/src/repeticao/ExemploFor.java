package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		for (int contador=0; contador<11; contador++) {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
		}
		
	}
	
}
