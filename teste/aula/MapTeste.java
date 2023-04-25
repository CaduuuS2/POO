package br.com.residencia.poo.teste.aula;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTeste {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Integer urna = 0;
		Integer votos = 0;
		Integer jv = 0;
		Integer cv = 0;
		Integer gv = 0;
		map.put("João", jv);
		map.put("Cadu", cv);
		map.put("Gabriel", gv);
		System.out.print("Quantas urnas temos? ");
		urna = sc.nextInt();

		for (int i = 0; i < urna; i++) {
			System.out.print("\nUrna " + (i + 1) + ";\n");
			System.out.print("João votos: ");
			votos = sc.nextInt();
			for (String key : map.keySet()) {
				if (key.equals("João")) {
					map.put("João", jv += votos);
				}
			}
			System.out.print("Cadu votos: ");
			votos = sc.nextInt();
			for (String key : map.keySet()) {
				if (key.equals("Cadu")) {
					map.put("Cadu", cv += votos);
				}
			}
			System.out.print("Gabriel votos: ");
			votos = sc.nextInt();
			for (String key : map.keySet()) {
				if (key.equals("Gabriel")) {
					map.put("Gabriel", gv += votos);
				}
			}
		}
		System.out.print("\n\nPanorama geral; \nJoão: ");
		for (String key : map.keySet()) {
			if (key.equals("João")) {
				System.out.print(map.get(key));
			}
		}
		System.out.print("\nCadu: ");
		for (String key : map.keySet()) {
			if (key.equals("Cadu")) {
				System.out.print(map.get(key));
			}
		}
		System.out.print("\nGabriel: ");
		for (String key : map.keySet()) {
			if (key.equals("Gabriel")) {
				System.out.print(map.get(key));
			}
		}

	}
}
