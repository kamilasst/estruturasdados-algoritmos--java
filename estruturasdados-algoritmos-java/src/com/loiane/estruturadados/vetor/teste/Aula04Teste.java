package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula04Teste {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);
		vetor.adicionar("Elemento 1");
		vetor.adicionar("Elemento 2");
		vetor.adicionar("Elemento 3");

		// Verificando quantidade de elementos no vetor
		System.out.println(vetor.getTamanho());

		// Imprimindo elementos do vetor
		System.out.println(vetor.toString());
	}

}
