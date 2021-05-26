package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		/*
		 * Boas práticas para nomenclatura
		 * 
		 * Identificadores (nomes dos elementos que criamos: 
		 * variáveis, classes, pacotes ect)
		 * 
		 * - Regras:
		 * 1ª - Não começarás com número. Exemplo: 1berto (errado) h1berto (certo)
		 * 2º - Não utilizarás palavras reservadas. Ex: int, double, class, void
		 * 3º - Não farás uso de caracteres especiais. Ex: n@me, tr#s, nome cliente..
		 * 
		 * - Padrões:
		 * 
		 * 1) CamelCase: da segunda palavra em diante (em uma composição) deve começar com letra maiúscula
		 * 
		 * certo -> dataNascimento
		 * errado -> datanascimento
		 * certo -> data_nascimento
		 * errado -> data_Nascimento
		 * 
		 * 2) UML: é responsável por padronizar elementos da Orientação a Objetos
		 * - Toda classe deve começar com letra maiúscula
		 * - Toda variável/pacote deve começar com letra minúscula
		 * - Todo método deve começar com letra minúscula e deve ser seguido de parenteses.
		 * 
		 * 
		 * 
		 */
		
		String email = "jessica.ZeferIno@itau-unibanco.Com.br";
		System.out.println("Original: " + email);
		System.out.println("Minúscula: " + email.toLowerCase());
		System.out.println("Maiúscula: " + email.toUpperCase());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posição do @: " + email.indexOf("@"));
		System.out.println("qtd de caracteres: " + email.length());
		//a segunda coordenada não é incluída
		System.out.println("do 2 até o 5º caracter: " + email.substring(1,5));
		System.out.println("primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Usuário: " + email.substring(0, email.indexOf("@")).toUpperCase());
		System.out.println("Servidor: " + email.substring((email.indexOf("@") + 1)).toLowerCase());
		System.out.println("Primeiro caracter: " + email.toUpperCase().charAt(0));
		
		
		// j e s s i c a . z e f e r i n o @
		// indexOf retorna um inteiro
		
	}
	
}
