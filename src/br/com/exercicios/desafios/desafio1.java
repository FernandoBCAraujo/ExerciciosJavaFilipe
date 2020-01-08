package br.com.exercicios.desafios;

public class desafio1 {

	public static void main(String[] args) {

		// tipos primitivos
		byte idade = 29;
		short quantidadeCarros = 1227;
		int distancia = 1200;
		long numeroMuitoGrande = 99812312L;
		float alturaMaxima = 7.98f;
		double tamanhoMicroscopico = 0.0021;
		char sexo = 'M';
		boolean isLigado = true;
		
		// Wrappers
		Byte idade2 = 30;
		Short quantidadeCarros2 = 9017;
		Integer distancia2 = 903;
		Long numeroMuitoGrande2 = 87381746409L;
		Float alturaMaxima2 = 9.32f;
		Double tamanhoMicroscopico2 = 0.00921;
		Character sexo2 = 'F';
		Boolean isDesligado = false;
		

		System.out.println("---------------------------------------");
		System.out.println("Tipos Primitivos");
		System.out.println("---------------------------------------");
		System.out.println("Olá, este(a) é um byte: " + idade);
		System.out.println("Olá, este(a) é um short: " + quantidadeCarros);
		System.out.println("Olá, este(a) é um int: " + distancia);
		System.out.println("Olá, este(a) é um long: " + numeroMuitoGrande);
		System.out.println("Olá, este(a) é um float: " + alturaMaxima);
		System.out.println("Olá, este(a) é um double: " + tamanhoMicroscopico);
		System.out.println("Olá, este(a) é um char: " + sexo);
		System.out.println("Olá, este(a) é um boolean: " + isLigado);
		
		System.out.println("---------------------------------------");
		System.out.println("Wrappers");
		System.out.println("---------------------------------------");
		System.out.println("Olá, este(a) é um Byte: " + idade2);
		System.out.println("Olá, este(a) é um Short: " + quantidadeCarros2);
		System.out.println("Olá, este(a) é um Int: " + distancia2);
		System.out.println("Olá, este(a) é um Long: " + numeroMuitoGrande2);
		System.out.println("Olá, este(a) é um Float: " + alturaMaxima2);
		System.out.println("Olá, este(a) é um Double: " + tamanhoMicroscopico2);
		System.out.println("Olá, este(a) é um Character: " + sexo2);
		System.out.println("Olá, este(a) é um Boolean: " + isDesligado);

	}

}
