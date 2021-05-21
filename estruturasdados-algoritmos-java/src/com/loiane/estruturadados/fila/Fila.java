package com.loiane.estruturadados.fila;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}

	public void enfileirar(T elemento) {
		this.adicionar(elemento);
	}

	public T desenfileirar() {

		final int POS = 0;

		if (this.estaVazia()) {
			return null;
		}

		T elementoASerRemovido = this.elementos[POS];

		this.remover(POS);

		return elementoASerRemovido;
	}

	public T espiar() {

		if (this.estaVazia()) {
			return null;
		}

		return this.elementos[0];
	}

}
