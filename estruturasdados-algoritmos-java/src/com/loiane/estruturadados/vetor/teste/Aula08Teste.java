package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula08Teste {

	public static void main(String[] args) {

		// Adicionando mais capacidade ao vetor
		Vetor vetor = new Vetor(3);

		vetor.adicionar("B");
		vetor.adicionar("C");
		vetor.adicionar("E");
		vetor.adicionar("F");
		vetor.adicionar("G");

		System.out.println(vetor);

	}

}
