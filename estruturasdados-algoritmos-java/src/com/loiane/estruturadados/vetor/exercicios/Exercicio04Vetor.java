package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio04Vetor {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<String>(5);

		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		lista.adicionar("E");

		System.out.println(lista.obtem(0));
		System.out.println(lista.obtem(2));
		System.out.println(lista.obtem(4));
	}
}
