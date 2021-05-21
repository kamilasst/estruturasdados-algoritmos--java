package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09Teste {

	public static void main(String[] args) {

		// Removendo elemento do vetor
		Vetor vetor = new Vetor(3);

		vetor.adicionar("B");
		vetor.adicionar("G");
		vetor.adicionar("D");
		vetor.adicionar("E");
		vetor.adicionar("F");

		System.out.println(vetor);

		vetor.remover(1);
		System.out.println(vetor);

		System.out.println("Remover o elemento A");

		try {
			vetor.remover("Z");
		} catch (Exception e) {
			System.out.println("Elemento não existe no vetor");
		}

		System.out.println(vetor);
	}
}
