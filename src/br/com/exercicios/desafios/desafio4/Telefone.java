package br.com.exercicios.desafios.desafio4;

public class Telefone {

	private String numeroTelefoneFixo;
	private String numeroTelefoneCelular;

	public String getNumeroTelefoneFixo() {
		return numeroTelefoneFixo;
	}

	public void setNumeroTelefoneFixo(String numeroTelefoneFixo) {
		this.numeroTelefoneFixo = numeroTelefoneFixo;
	}

	public String getNumeroTelefoneCelular() {
		return numeroTelefoneCelular;
	}

	public void setNumeroTelefoneCelular(String numeroTelefoneCelular) {
		this.numeroTelefoneCelular = numeroTelefoneCelular;
	}

	public Telefone() {

	};

	public Telefone(String numeroTelefoneFixo, String numeroTelefoneCelular) {
		super();
		this.numeroTelefoneFixo = numeroTelefoneFixo;
		this.numeroTelefoneCelular = numeroTelefoneCelular;
	}

	public String toString(){
	 return "Número Celular: " + numeroTelefoneCelular +
			"\nNúmero Fixo: " + numeroTelefoneFixo;
	}

}
