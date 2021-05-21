package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12Teste {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A"); // M�todo que adiciona no array
		arrayList.add("C");

		System.out.println(arrayList);

		arrayList.add(1, "B");

		System.out.println(arrayList);

		boolean existe = arrayList.contains("A");// M�todo que busca e verifica se o elemento exite no array
		if (existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento n�o existe no array");
		}

		int pos = arrayList.indexOf("D"); // Retorna o �ndice que o objeto se encontra
		if (pos > -1) {
			System.out.println("Elemento existe no array - posi��o " + pos);
		} else {
			System.out.println("Elemento n�o existe no array - posi��o  " + pos);
		}

		System.out.println(arrayList.get(2)); // M�todo que busca o elemento pela posi��o desejada

		arrayList.remove(0);
		arrayList.remove("B");

		System.out.println(arrayList);

		System.out.println(arrayList.size()); // Tamanho do array
	}
}
