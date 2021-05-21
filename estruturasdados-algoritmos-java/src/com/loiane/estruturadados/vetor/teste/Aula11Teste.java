package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.negocio.Contato;
import com.loiane.estruturadados.vetor.Lista;

public class Aula11Teste {

	public static void main(String[] args) {

		// Definindo o tipo de vetor dinamicamente
		Lista<Contato> lista = new Lista<Contato>(1);

		Contato c1 = new Contato("123", "Contato 1", "1234-4567", "contato1@email.com");
		Contato c2 = new Contato("456", "Contato 2", "2345-6789", "contato2@email.com");
		Contato c3 = new Contato("789", "Contato 3", "3456-7890", "contato3@email.com");

		lista.adicionar(c1);
		// lista.adiciona("Contato 1"); não permite adicionar pq o array é to tipo
		// Contato
	}

}
