package com.loiane.estruturadados.vetor.exercicios;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio02Vetor {

	public static void main(String[] args) {

		/*
		 * Implementando o método ultimoIndice, semelhante ao método lastIndexOf da
		 * classe arrayList
		 */

		ArrayList<String> arrayList = new ArrayList<String>(5);
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("A");

		System.out.println(arrayList.lastIndexOf("A"));

		Lista<String> lista = new Lista<String>(5);
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("A");

		System.out.println(lista.ultimoIndice("A"));

	}
}
