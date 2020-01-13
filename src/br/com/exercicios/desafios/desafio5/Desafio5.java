package br.com.exercicios.desafios.desafio5;

import java.util.Scanner;

import br.com.exercicios.desafios.desafio5.validator.ValidadorVariavelString;

public class Desafio5 {

/*	DESAFIO 5
    Criar um validador de variáveis do tipo String.
	Se a variável for vazia (nula), retornar falso, se não, verdadeiro.*/
	
	public static void main(String[] args) {
	
		ValidadorVariavelString validador = new ValidadorVariavelString();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o seu nome: ");
		
		String nome;
		nome = scan.next();
		validador.setStringRecebida(nome);
		
		System.out.println("Resultado: " + validador.validaStringRecebida(nome));

		
		scan.close();
		
//		Optional<String> nome;
//		scan.hasNext(validador.setStringRecebida(nome));
//		validador.setStringRecebida(nome);
//		String nome = ValidadorVariavelString. scan.next();
		

	}

}
