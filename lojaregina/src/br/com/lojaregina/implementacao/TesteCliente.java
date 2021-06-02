package br.com.lojaregina.implementacao;

import javax.swing.JOptionPane;

import br.com.lojaregina.modelo.Cliente;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		//Instanciando o objeto
		Cliente objeto = new Cliente();
		
		//preenchendo o objeto
		objeto.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
		objeto.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
		objeto.setEmail(JOptionPane.showInputDialog("Email").toLowerCase());
		objeto.setTelefone(JOptionPane.showInputDialog("Telefone"));
		
		//Retornando os dados do objeto
		System.out.println("ID: " + objeto.getId());
		System.out.println("Nome: " + objeto.getNome());
		System.out.println("Email: " + objeto.getEmail());
		System.out.println("Fone: " + objeto.getTelefone());
		System.out.println("Usu�rio: " + objeto.getUsuario());
		
	}

}
