package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula22Fila {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<Integer>();

		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);

		System.out.println(fila);

		System.out.println(fila.desenfileirar());

		System.out.println(fila);

		System.out.println(fila.desenfileirar());

		System.out.println(fila);

		System.out.println(fila.desenfileirar());

		System.out.println(fila);
	}

}
