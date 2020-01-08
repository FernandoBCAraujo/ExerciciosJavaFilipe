package br.com.exercicios.desafios.desafio4;

public class AgendaTelefonica {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Telefone telefone = new Telefone();
		
		pessoa.setNomeCompleto("Fernando Bezerra Correia de Araujo");
		pessoa.setApelido("Nando");
		
		telefone.setNumeroTelefoneCelular("997893789");
		telefone.setNumeroTelefoneFixo("30343854");
		
		System.out.println(pessoa);
		System.out.println(telefone);

	}

}
