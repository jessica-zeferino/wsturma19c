package decisao;

import javax.swing.JOptionPane;

public class Exercicio4 {

	/*
	 * Exercicio 4:
	 * Receba tr?s n?meros inteiros e coloque-os em ordem num?rica
	 * crescente. Garanta que os tr?s n?meros sejam diferentes.
	 */

	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1? n?mero: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2? n?mero: "));
		int z = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3? n?mero: "));
		int aux;

		if (x!=y && x!=z && y!=z) {

			if(x>y) {
				aux = y;
				y = x;
				x = aux;
			}if(x>z) {
				aux = z; 
				z = x;
				x = aux;
			}if(y>z) {
				aux = z;
				z = y;
				y = aux;
			}

			System.out.println(x + ", " + y + ", " + z);

		}else {
			System.out.println("Voc? escolheu valores iguais!!!");
		}


	}

}
