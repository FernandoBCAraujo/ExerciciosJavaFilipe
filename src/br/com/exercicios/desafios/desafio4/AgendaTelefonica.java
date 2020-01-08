package br.com.exercicios.desafios.desafio4;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();		
		pessoa.setNomeCompleto("Fernando Bezerra Correia de Araujo");
		pessoa.setApelido("Nando");
		
		Telefone telefone = new Telefone();	
		Telefone telefone2 = new Telefone();	
		List<Telefone> listTelefone = new ArrayList<>();
		telefone.setNumeroTelefoneCelular("997893789");
		telefone.setNumeroTelefoneFixo("30343854");
		
		
		telefone2.setNumeroTelefoneCelular("9923893789");
		telefone2.setNumeroTelefoneFixo("30343854");
		
		listTelefone.add(telefone);
		listTelefone.add(telefone2);
		
		pessoa.setListaTelefone(listTelefone);
//		System.out.println(pessoa.getNomeCompleto());
//		System.out.println(telefone.getNumeroTelefoneCelular());
    	System.out.println(pessoa);
		
		System.out.println(listTelefone);

	}

}
