package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio01Vetor {

	public static void main(String[] args) {

		/*
		 * Implementando o método contém, semelhante ao método contains da classe
		 * ArrayList
		 */
		Lista<String> lista = new Lista<String>(5);

		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");

		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("E"));

	}

}
