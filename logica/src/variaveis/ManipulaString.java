package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		/*
		 * Boas pr�ticas para nomenclatura
		 * 
		 * Identificadores (nomes dos elementos que criamos: 
		 * vari�veis, classes, pacotes ect)
		 * 
		 * - Regras:
		 * 1� - N�o come�ar�s com n�mero. Exemplo: 1berto (errado) h1berto (certo)
		 * 2� - N�o utilizar�s palavras reservadas. Ex: int, double, class, void
		 * 3� - N�o far�s uso de caracteres especiais. Ex: n@me, tr#s, nome cliente..
		 * 
		 * - Padr�es:
		 * 
		 * 1) CamelCase: da segunda palavra em diante (em uma composi��o) deve come�ar com letra mai�scula
		 * 
		 * certo -> dataNascimento
		 * errado -> datanascimento
		 * certo -> data_nascimento
		 * errado -> data_Nascimento
		 * 
		 * 2) UML: � respons�vel por padronizar elementos da Orienta��o a Objetos
		 * - Toda classe deve come�ar com letra mai�scula
		 * - Toda vari�vel/pacote deve come�ar com letra min�scula
		 * - Todo m�todo deve come�ar com letra min�scula e deve ser seguido de parenteses.
		 * 
		 * 
		 * 
		 */
		
		String email = "jessica.ZeferIno@itau-unibanco.Com.br";
		System.out.println("Original: " + email);
		System.out.println("Min�scula: " + email.toLowerCase());
		System.out.println("Mai�scula: " + email.toUpperCase());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("qtd de caracteres: " + email.length());
		//a segunda coordenada n�o � inclu�da
		System.out.println("do 2 at� o 5� caracter: " + email.substring(1,5));
		System.out.println("primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")).toUpperCase());
		System.out.println("Servidor: " + email.substring((email.indexOf("@") + 1)).toLowerCase());
		System.out.println("Primeiro caracter: " + email.toUpperCase().charAt(0));
		
		
		// j e s s i c a . z e f e r i n o @
		// indexOf retorna um inteiro
		
	}
	
}
