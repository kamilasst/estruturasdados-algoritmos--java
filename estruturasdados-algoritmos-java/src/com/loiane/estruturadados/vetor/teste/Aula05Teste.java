package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05Teste {

	public static void main(String[] args) {

		// Obtendo elemento de uma posição
		Vetor vetor = new Vetor(5);
		vetor.adicionar("Elemento 1"); // 0
		vetor.adicionar("Elemento 2"); // 1
		vetor.adicionar("Elemento 3"); // 2

		System.out.println(vetor.buscar(2));

	}

}
