package com.loiane.estruturadados.fila;

public class FilaComPrioridade<T> extends Fila<T> {

	public void enfileirar(T elemento) {

		Comparable<T> chave = (Comparable<T>) elemento;

		int i;

		for (i = 0; i < this.tamanho; i++) {
			T valorArray = this.elementos[i];
			int valorCompareTo = chave.compareTo(valorArray);
			if (valorCompareTo < 0) {
				break;
			}
		}
		this.adicionar(i, elemento);

	}
}
