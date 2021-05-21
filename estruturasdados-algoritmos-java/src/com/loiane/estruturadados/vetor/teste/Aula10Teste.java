package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.negocio.Contato;
import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10Teste {

	public static void main(String[] args) {

		// Generalizando o tipo dos elementos
		VetorObjetos vetor = new VetorObjetos(3);

		Contato c1 = new Contato("123", "Contato 1", "1234-4567", "contato1@email.com");
		Contato c2 = new Contato("456", "Contato 2", "2345-6789", "contato2@email.com");
		Contato c3 = new Contato("789", "Contato 3", "3456-7890", "contato3@email.com");
		Contato c4 = new Contato("123", "Contato 1", "1234-4567", "contato1@email.com");
		Contato c5 = new Contato("123", "Contato 5", "5555-5555", "contato5@email.com");

//		boolean saogIguais = c1.equals(c5);
//		System.out.println("saogIguais: " + saogIguais);

		vetor.adicionar(c1);
		vetor.adicionar(c2);
		vetor.adicionar(c3);

		System.out.println("Tamanho = " + vetor.tamanho());

		int posicao = vetor.buscar(c5);
		if (posicao > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}

		System.out.println(vetor);
	}
}
