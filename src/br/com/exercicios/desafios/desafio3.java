package br.com.exercicios.desafios;

public class desafio3 {

	public static void main(String[] args) {

		// proximoNumero = penultimoNumero + antiPenultimoNumero;
		int antiPenultimoNumero = 1;
		int penultimoNumero = 1;
		int proximoNumero;
		int contador = 0;
		
		System.out.println(antiPenultimoNumero);
		System.out.println(penultimoNumero);
		do {
			proximoNumero = antiPenultimoNumero + penultimoNumero;
			System.out.println(proximoNumero);
			antiPenultimoNumero = penultimoNumero;
			penultimoNumero = proximoNumero;
			contador = contador + 1;
		} while (contador != 8);

	}

}
