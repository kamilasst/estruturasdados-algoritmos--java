package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class aula06Teste {

	public static void main(String[] args) {

		// Verificando se o elemento existe dento do vetor
		// Se existir ele retorna a sua posição
		// Se não existe ele retorna -1
		Vetor vetor = new Vetor(10);
		vetor.adicionar("Elemento 1"); // 0
		vetor.adicionar("Elemento 2"); // 1
		vetor.adicionar("Elemento 3"); // 2

		System.out.println(vetor.buscar("Elemento 2"));
		System.out.println(vetor.buscar("elemento 2"));
		System.out.println(vetor.buscar("Elemento 4"));
		System.out.println(vetor.buscar(null));
	}

}
