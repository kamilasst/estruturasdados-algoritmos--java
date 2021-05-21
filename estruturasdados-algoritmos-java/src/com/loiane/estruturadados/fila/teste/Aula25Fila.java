package com.loiane.estruturadados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25Fila {

	public static void main(String[] args) {

		Queue<Paciente> filaComPrioridade = new PriorityQueue<>(new Comparator<Paciente>() {
			@Override
			public int compare(Paciente p1, Paciente p2) {
				Integer valorInteger = Integer.valueOf(p1.getPrioridade());
				return valorInteger.compareTo(p2.getPrioridade());
			}
		});

		filaComPrioridade.add(new Paciente("A", 2));
		filaComPrioridade.add(new Paciente("B", 1));
		filaComPrioridade.add(new Paciente("C", 3));
		filaComPrioridade.add(new Paciente("D", 5));
		filaComPrioridade.add(new Paciente("E", 4));

		System.out.println(filaComPrioridade);

	}

}
