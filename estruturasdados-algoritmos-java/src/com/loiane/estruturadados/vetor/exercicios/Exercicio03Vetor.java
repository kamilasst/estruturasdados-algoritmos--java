package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio03Vetor {

	public static void main(String[] args) {

		/*
		 * Implementando o m�todo remover(T elemento), onde ser� poss�vel remover um
		 * elemento da lista passando o mesmo como par�metro
		 */

		Lista<String> lista = new Lista<String>(5);

		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		lista.adicionar("E");

		System.out.println(lista);

		lista.remover("A");

		System.out.println(lista);

		lista.remover("E");

		System.out.println(lista);

		lista.remover("C");

		System.out.println(lista);

	}
}
