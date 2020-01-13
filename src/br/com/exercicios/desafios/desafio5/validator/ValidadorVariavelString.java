package br.com.exercicios.desafios.desafio5.validator;

public class ValidadorVariavelString {

	private String stringRecebida;

	public Boolean validaStringRecebida(String stringRecebida) {

	Boolean retorno;
	if (!this.stringRecebida.isEmpty()) {
		System.out.println("String validada com sucesso.");	
		retorno = true;
	} else  {
		System.out.println("Por favor, insira uma String não nula!");
		retorno = false;
	}
	return retorno;
}

	public  String getStringRecebida() {
		return stringRecebida;
	}

	public void setStringRecebida(String stringRecebida) {
		this.stringRecebida = stringRecebida;
	}

	public ValidadorVariavelString(String stringRecebida) {
		super();
		this.stringRecebida = stringRecebida;
	}
//	public Optional<String> getStringRecebida() {
//		return stringRecebida;
//	}
//	
//	public void setStringRecebida(Optional<String> stringRecebida) {
//		this.stringRecebida = stringRecebida;
//	}
//	
//	public ValidadorVariavelString(Optional<String> stringRecebida) {
//		super();
//		this.stringRecebida = stringRecebida;
//	}
	
	public ValidadorVariavelString() {}

}
