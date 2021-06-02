package br.com.lojaregina.modelo;

public class Produto {
	
	private int id, qtde;
	private String descricao;
	private double valorCompra;
	private double valorVenda;
	
	public Produto() {
		super();
	}
	
	public Produto(int id, int qtde, String descricao, double valorCompra, double valorVenda) {
		super();
		this.id = id;
		this.qtde = qtde;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
	}

	public String getVerificarEstoque() {
		if (qtde>20) {
			return "Estoque alto";
		}else if(qtde<10) {
			return "Estoque baixo";
		}else {
			return "Estoque médio";
		}
	}
	
	public void setAtualizarValores(double porc) {
		valorCompra = valorCompra + valorCompra * (porc/100);
		valorVenda = valorVenda + valorVenda * (porc/100);
	}
	
	public double getTotalVenda(){
		return valorVenda*qtde;
	}
	
	public double getDesconto(double porc) {
		return valorVenda * (1 - porc/100); //eu quero 20% de desconto. eu vou fazer 20/100 = 0,2 e multiplicar por 1-isso
	}
	
	public double getDesconto(){
		return valorVenda * 0.9;
	}
		
	@Override
	public String toString() {
		return "Produto [id=" + id + ", qtde=" + qtde + ", descricao=" + descricao + ", valorCompra=" + valorCompra
				+ ", valorVenda=" + valorVenda + ", totalVenda=" + "]";
	}

	public void setAll(int id, String descricao, double valorCompra, double valorVenda, int qtde) {
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	

}
