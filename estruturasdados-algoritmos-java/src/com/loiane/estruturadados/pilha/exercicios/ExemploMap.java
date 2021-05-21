package com.loiane.estruturadados.pilha.exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {

//		Map<String, Livro> map = new HashMap<String, Livro>();
//
//		for (int i = 1; i < 100; i++) {
//			map.put(i + "", new Livro("isbs" + i, "Kamila" + i, "2020" + i, "Livro de amor" + i));
//		}
//
//		for (var entry : map.entrySet()) {
//			System.out.println("Key:" + entry.getKey() + " - Valor: " + entry.getValue());
//		}

		/////////////////////////////////// Exemplo 2

		Map<String, List<Livro>> map2 = new HashMap<String, List<Livro>>();

		List<Livro> livrosRomance = new ArrayList<Livro>();
		livrosRomance.add(new Livro("isbs", "Kamila", "2020", "Livro de amor 1"));
		livrosRomance.add(new Livro("isbs", "Kamila", "2020", "Livro de amor 2"));
		livrosRomance.add(new Livro("isbs", "Kamila", "2020", "Livro de amor 3"));

		map2.put("001", livrosRomance);

		for (var entry : map2.entrySet()) {
			System.out.println(":::: Key: " + entry.getKey());

			// System.out.println("Valores: " + entry.getValue());

			for (Livro livro : entry.getValue()) {
				System.out.println("Valor: " + livro);
			}
		}
	}
}
