package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	// main() � o start point de uma aplica��o Java
	// � a chave de igni��o do carro
	public static void main(String args[]) {
		
		// Sintaxe: <tipo de dado> <nome var> = <dado>;
		
		String nome=JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome ..: " + nome);
		System.out.println("Idade..: " + idade);
		System.out.println("Altura.: " + altura);
		System.out.println("IMC.: " + imc);
		
		
		/*
		 * alfanum�rico: � um texto, parte de um texto ou um n�mero
		 * que n�o ser� utilizado em opera��es matem�ticas
		 * CEP (RH itau) => 08210-230
		 * Em Javan�s: String
		 * 
		 * num�rico: representa um dado que pode ser utilizado em
		 * express�es matem�ticas
		 * CEP (aplica��o dos correios) => 08210320
		 * CPF (app receita federal)
		 * Funcional (colaboradores do itau)
		 * RM (alunos de uma faculdade)
		 * em Javan�s:
		 *  - int => representa��o de n�meros inteiros
		 *  - double => 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/*
	 * � um bloco de anota��es
	 * em uma classe encontramos: m�todos e atributos
	 * nossa classe � p�blica
	 * 
	 */
	
}
