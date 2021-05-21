package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula20Fila {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<Integer>();

		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);

		System.out.println(fila.estaVazia());// false
		System.out.println(fila.tamanho());// 3

		System.out.println(fila);// toString
	}

}
