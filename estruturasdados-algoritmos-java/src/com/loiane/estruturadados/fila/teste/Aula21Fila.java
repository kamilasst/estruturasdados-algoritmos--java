package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula21Fila {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<Integer>();

		fila.enfileirar(1);
		fila.enfileirar(2);

		System.out.println(fila.espiar());

		System.out.println(fila.toString());

	}

}
