package br.com.unixyz.modelo;

public class Professor {
	
	private String nomeHorario;
	private String formacao;
	private int cargaHoraria;
	private Endereco endereco;
	
	@Override
	public String toString() {
		return "Professor [nomeHorario=" + nomeHorario + ", formacao=" + formacao + ", cargaHoraria=" + cargaHoraria
				+ ", endereco=" + endereco + "]";
	}

	public Professor() {
		super();
	}
	
	public Professor(String nomeHorario, String formacao, int cargaHoraria, Endereco endereco) {
		super();
		this.nomeHorario = nomeHorario;
		this.formacao = formacao;
		this.cargaHoraria = cargaHoraria;
		this.endereco = endereco;
	}
	public String getNomeHorario() {
		return nomeHorario;
	}
	public void setNomeHorario(String nomeHorario) {
		this.nomeHorario = nomeHorario;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
