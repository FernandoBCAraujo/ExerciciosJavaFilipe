package br.com.exercicios.desafios;

public class TryAndCatch {

	public static void main(String[] args) {
		TryAndCatch tryAndCatch = new TryAndCatch();
		
	System.out.println(tryAndCatch.converteInteiroParaString(3));
		
	}		
		
		
		private String converteInteiroParaString(Integer in) {
			String stringConvertida = null ;
			try {
				stringConvertida = String.valueOf(in);
			
			} catch (Exception e) {
				System.out.println("deu merda!");
			}
			return stringConvertida;
		}
		

	}


