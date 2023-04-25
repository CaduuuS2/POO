package br.com.residencia.poo.listaone;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		double num;
		double numtwo;
		double resultado;
		Integer option;
		Integer optiontwo;
		String optionthree;
		boolean valid = true;
		boolean validtwo = true;
		boolean validthree = true;
		boolean verifica;
		Scanner sc = new Scanner(System.in);
		while (valid == true) {
			System.out.print("\nPrimeiro número: ");
			num = sc.nextDouble();
			System.out.print("\nSegundo número: ");
			numtwo = sc.nextDouble();
			validthree = true;
			while (validthree == true) {
				System.out.print("\nQual operação você gostaria de fazer?\nPara Soma, digite 1\nPara Subração,"
						+ "digite 2\nPara multiplicação, digite 3\nPara Divisão, digite 4\n");
				optionthree = sc.next();
				verifica = optionthree != null && optionthree.matches("[0-9]+");
				if (verifica == true) {
					validthree = false;
					option = Integer.parseInt(optionthree);
					if (option.equals(1)) {
						resultado = num + numtwo;
						System.out.print("\nO resultado de " + num + " + " + numtwo + " é igual à: " + resultado);
						validtwo = true;
						while (validtwo == true) {
							System.out.print("\n\nPara reiserir digite 1\nPara finalizar programa digite 2\n");
							optiontwo = sc.nextInt();
							if (optiontwo.equals(1)) {
								validtwo = false;
								valid = true;
							} else if (optiontwo.equals(2)) {
								validtwo = false;
								valid = false;
								System.out.print("Volte sempre S2!");
							} else {
								System.out.print(
										"\n\"" + optiontwo + "\"" + "não é uma opção válida!\n\nTente novamente!");
								validtwo = true;
							}
						}
					} else if (option.equals(2)) {
						resultado = num - numtwo;
						System.out.print("\nO resultado de " + num + " - " + numtwo + " é igual à: " + resultado);
						validtwo = true;
						while (validtwo == true) {
							System.out.print("\n\nPara reiserir digite 1\nPara finalizar programa digite 2\n");
							optiontwo = sc.nextInt();
							if (optiontwo.equals(1)) {
								validtwo = false;
								valid = true;
							} else if (optiontwo.equals(2)) {
								validtwo = false;
								valid = false;
								System.out.print("Volte sempre S2!");
							} else {
								System.out.print(
										"\n\"" + optiontwo + "\"" + "não é uma opção válida!\n\nTente novamente!");
								validtwo = true;
							}
						}
					} else if (option.equals(3)) {
						resultado = num * numtwo;
						System.out.print("\nO resultado de " + num + " * " + numtwo + " é igual à: " + resultado);
						validtwo = true;
						while (validtwo == true) {
							System.out.print("\n\nPara reiserir digite 1\nPara finalizar programa digite 2\n");
							optiontwo = sc.nextInt();
							if (optiontwo.equals(1)) {
								validtwo = false;
								valid = true;
							} else if (optiontwo.equals(2)) {
								validtwo = false;
								valid = false;
								System.out.print("Volte sempre S2!");
							} else {
								System.out.print(
										"\n\"" + optiontwo + "\"" + "não é uma opção válida!\n\nTente novamente!");
								validtwo = true;
							}
						}
					} else if (option.equals(4)) {
						resultado = num / numtwo;
						System.out.print("\n resultado de " + num + " / " + numtwo + " é igual à: " + resultado);
						validtwo = true;
						while (validtwo == true) {
							System.out.print("\n\nPara reiserir digite 1\nPara finalizar programa digite 2\n");
							optiontwo = sc.nextInt();
							if (optiontwo.equals(1)) {
								validtwo = false;
								valid = true;
							} else if (optiontwo.equals(2)) {
								validtwo = false;
								valid = false;
								System.out.print("Volte sempre S2!");
							} else {
								System.out.print(
										"\n\"" + optiontwo + "\"" + "não é uma opção válida!\n\nTente novamente!");
								validtwo = true;
							}
						}
					} else {
						System.out.print("\n\"" + option + "\"" + " não é uma opção válida!\n\nTente novamente!");
						validthree = true;
						
					}
				} else {
					System.out.print("\"" + optionthree + "\"" + "não é uma opção válida!\nTente novamente!\n");
					validthree = true;
				}
			}
		}
		sc.close();
	}
}
