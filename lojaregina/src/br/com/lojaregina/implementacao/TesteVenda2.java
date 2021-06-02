package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Venda;

public class TesteVenda2 {
	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
				1,
				"12/05/2021",
				new Produto(
						100,
						10,
						"Churros",
						6,
						12
						),
				new Cliente(
						5,
						"XPTO",
						"xpto@cpto",
						"2763823",
						new Endereco(
								"rua tal",
								"21",
								"x",
								"bairro x",
								"sao paulo",
								"sp",
								"92839283"
								)
						),
				new Colaborador(
						1,
						"jessi",
						new Endereco(
								"rua tal",
								"21",
								"x",
								"bairro x",
								"sao paulo",
								"sp",
								"92839283"
								),
						"cargo x",
						7000
						),
				new Pagamento(
						5,
						190,
						"12/08/2020",
						"Débito"
						)
				);
		
		System.out.println(venda.toString());
		
	}

}
