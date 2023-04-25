package br.com.residencia.poo.listaone;

import java.util.Scanner;

public class TesteDois {

	public static void main(String[] args) {
		double num;
		double numtwo;
		double resultado;
		Integer option;
		String optiontwo;
		String optionthree;
		boolean valid = true;
		boolean validtwo = true;
		boolean validthree = true;
		boolean verifica;
		Scanner sc = new Scanner(System.in);
		if (option.equals(1)) {
			resultado = num + numtwo;
			System.out.print("\nO resultado de " + num + " + " + numtwo + " é igual à: " + resultado);
			validtwo = true;
			while (validtwo == true) {
				System.out.print("\n\nPara reiserir digite 1\nPara finalizar programa digite 2\n");
				optiontwo = sc.next();
				verificadois = optiontwo != null && optiontwo.matches("[0-9]+");
				if (verificadois == true) {
					if (optiontwo.equals(1)) {
						validtwo = false;
						valid = true;
					} else if (optiontwo.equals(2)) {
						validtwo = false;
						valid = false;
						System.out.print("Volte sempre S2!");
					} else {
						System.out.print("\n\"" + optiontwo + "\"" + "não é uma opção válida!\n\nTente novamente!");
						validtwo = true;
					}
				} else {
					System.out.print("\"" + optionthree + "\"" + "não é uma opção válida!\nTente novamente!\n");
					validthree = true;
				}
			}
		}

	}

}
