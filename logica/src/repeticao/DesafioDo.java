package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
	
	//show: message/confirm/input
	
	public static void main(String[] args) {
		
		int numero, chute, tentativas;
		tentativas = 0;		
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, digite um número"));
		chute = 0;
		
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2, adivinhe número"));
			tentativas+=1;
			//tentativas++;
			
			if(chute>numero) {
				JOptionPane.showMessageDialog(null, "Chutou acima");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Chutou abaixo");
			}
		
		}while (numero!=chute);
		
		JOptionPane.showMessageDialog(null, "Parabéns, você acertou! Usou " + tentativas + " tentativa(s).");
		
		
		
		
		
	}

}
