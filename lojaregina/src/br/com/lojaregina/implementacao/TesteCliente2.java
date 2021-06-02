package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Endereco;

public class TesteCliente2 {
	
	public static void main(String[] args) {
		
		Cliente objeto = new Cliente();
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua x");
		endereco.setNumero("50");
		endereco.setComplemento("");
		endereco.setBairro("Centro");
		endereco.setCidade("São Paulo");
		endereco.setUf("SP");
		endereco.setCep("12345678");
		
		objeto.setAll(endereco, 1, "xpto", "j@xpto", "2636471");
		
		
		System.out.println(objeto.toString());
		System.out.println("Usuário: " + objeto.getUsuario());
		
	}

}
