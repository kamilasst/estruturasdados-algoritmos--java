package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class Aula24Fila {

	public static void main(String[] args) {

		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

		fila.enfileirar(new Paciente("A", 2));
		fila.enfileirar(new Paciente("C", 1));
		// fila.enfileirar(new Paciente("B", 3));

		System.out.println(fila); // 1 2 3 e nao 1 3 2

		System.out.println(fila.desenfileirar());

		System.out.println(fila);
	}
}
