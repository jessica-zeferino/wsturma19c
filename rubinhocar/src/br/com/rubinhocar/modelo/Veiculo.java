package br.com.rubinhocar.modelo;

public class Veiculo {

	private String modelo;
	private double valor;
	private int velocidadeAtual;
	private boolean status;
	// método:
	// <modificador> <tipo do retorno> <nome do método>(<tipo param>, <nome param>, ...)

	public String retornarTudo() {
		String xpto = "NÃO";
		if (status==true) {
			xpto = "SIM";
		}
		return 
				"Modelo:" + modelo + "\n" +
				"Valor:" + valor + "\n" + 
				"Velocidade: " + velocidadeAtual + "\n" +
				"Ligado? " + xpto;
	}
	
	public void desacelerar() {
			velocidadeAtual=0;
	}
	
	public void desacelerar(int param) {
		if(status==true || velocidadeAtual>=param) {
			velocidadeAtual-=param;
		}
	}
	
	public String desligar() {
		velocidadeAtual=0;
		status=false;
		return "Desligado";
	}
	
	public String ligar() {
		status=true;
		return "Ligado";
	}
	
	public double retornarValor() {
		return valor;
	}
	
	public void acelerar(int param) {
		if(status==true) {
			velocidadeAtual+=param;
		}
	}
	
	public void preencherValor(double param) {
		valor = param;
	}
	
	public String retornarModelo() {
		return modelo;
	}
	
	public void preencherModelo(String param) {
		if (param.length()<10) {
			modelo = param.toUpperCase();
		}
	}
	
	
}
