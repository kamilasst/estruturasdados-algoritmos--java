package com.loiane.estruturadados.vetor.exercicios;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio05Vetor {

	public static void main(String[] args) {

		/*
		 * Exerc�cio 04 - Criar m�todo limpar para limpar todos os elementos, ele �
		 * semelhante ao m�todo clear da classe arrayList
		 */
		ArrayList<String> arrayList = new ArrayList<String>(5);

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

		System.out.println(arrayList);

		arrayList.clear();

		System.out.println(arrayList);

		Lista<String> lista = new Lista<String>(5);

		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		lista.adicionar("E");

		System.out.println(lista);

		lista.limpar();

		System.out.println(lista);

	}

}
