package br.com.exercicios.desafios.desafio5.validator;

import java.util.Optional;

public class ValidadorVariavelString {

	private Optional<String> stringRecebida;

	public Boolean validaStringRecebida() {
		Boolean retorno;
		if (this.stringRecebida.isPresent()) {
			System.out.println("String validada com sucesso.");	
			retorno = true;
		} else {
			System.out.println("Por favor, insira uma String não nula!");
			retorno = false;
		}
		return retorno;
	}

	public Optional<String> getStringRecebida() {
		return stringRecebida;
	}

	public void setStringRecebida(Optional<String> stringRecebida) {
		this.stringRecebida = stringRecebida;
	}

}
