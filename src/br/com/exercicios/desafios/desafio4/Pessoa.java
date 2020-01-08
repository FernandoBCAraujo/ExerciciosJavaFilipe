package br.com.exercicios.desafios.desafio4;

import java.util.List;

public class Pessoa {

	private String nomeCompleto;
	private String apelido;
	//@OneToMany
	private List<Telefone> listaTelefone;

	public List<Telefone> getListaTelefone() {
		return listaTelefone;
	}

	public void setListaTelefone(List<Telefone> listaTelefone) {
		this.listaTelefone = listaTelefone;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Pessoa() {

	};

	public Pessoa(String nomeCompleto, String apelido, List<Telefone> listaTelefone) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.apelido = apelido;
		this.listaTelefone = listaTelefone;
	}

//	public String toString() {
//		return "Nome Completo: " + nomeCompleto +
//				"\nApelido: " + apelido;
//	}
}
