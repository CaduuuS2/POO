package br.com.residencia.poo.listaone;

import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		double celsius;
		double fahrenheit;
		Integer loop = 1;
		Boolean looptwo = true;
		Integer option;
		Scanner sc = new Scanner(System.in);
		while (loop.equals(1)) {
			System.out.print("\nDigite um valor em Celsius: ");
			celsius = sc.nextFloat();
			fahrenheit = celsius * 1.8 + 32;
			System.out.print("O valor de Celsius em Fahrenheit é: " + fahrenheit + "°F\n"
					+ "Para reiserir um valor digite 1, para encerrar o programa digite 2: ");
			option = sc.nextInt();
			if (option.equals(2)) {
				loop = 2;
			} else if (option.equals(1)) {
				loop = option;
			} else {
				looptwo = true;
				while (looptwo.equals(true)) {
					System.out.print("\n\"" + option + "\"" + " não é um valor válido, tente novamente: \n ");
					System.out.print("Para reiserir um valor digite 1, para encerrar o programa digite 2: ");
					option = sc.nextInt();
					if (option.equals(1)) {
						looptwo = false;
						loop = 1;
					} else if (option.equals(2)) {
						loop = 2;
						looptwo = false;
					} else {
						looptwo = true;
					}
				}
			}
		}
		sc.close();
	}
}
