package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12Teste {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A"); // Método que adiciona no array
		arrayList.add("C");

		System.out.println(arrayList);

		arrayList.add(1, "B");

		System.out.println(arrayList);

		boolean existe = arrayList.contains("A");// Método que busca e verifica se o elemento exite no array
		if (existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}

		int pos = arrayList.indexOf("D"); // Retorna o índice que o objeto se encontra
		if (pos > -1) {
			System.out.println("Elemento existe no array - posição " + pos);
		} else {
			System.out.println("Elemento não existe no array - posição  " + pos);
		}

		System.out.println(arrayList.get(2)); // Método que busca o elemento pela posição desejada

		arrayList.remove(0);
		arrayList.remove("B");

		System.out.println(arrayList);

		System.out.println(arrayList.size()); // Tamanho do array
	}
}
