package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Digite o email").toLowerCase();
		
		while (email.contains("@")==false || email.indexOf("@")<2) {
			email = JOptionPane.showInputDialog("Digite o email novamente").toLowerCase();
		}
		
		System.out.println("Usu?rio: " + email.substring(0, email.indexOf("@")));
		
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		// O nome n?o pode ter menos que 3 caracteres e mais que 20 caracteres
		
		while (nome.length()>20 || nome.length()<3) {
			nome = JOptionPane.showInputDialog("Digite o nome novamente").toUpperCase();
		}
		
		System.out.println("Nome validado: " + nome);
		
	}
	
}
