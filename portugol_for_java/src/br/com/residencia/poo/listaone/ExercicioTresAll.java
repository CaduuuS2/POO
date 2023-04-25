package br.com.residencia.poo.listaone;

import java.util.Scanner;

public class ExercicioTresAll {

	public static void main(String[] args) {
		Double num;
		Double numtwo;
		Double resultado;
		String numcal;
		String numtwocal;
		boolean numver;
		boolean numtwover;
		Integer option;
		String optionthree;
		boolean valid = true;
		boolean validthree = true;
		boolean validini = true;
		boolean verifica;
		Integer retorno;
		Scanner sc = new Scanner(System.in);
		CalculadoraRetorno teste = new CalculadoraRetorno();
		while (valid == true) {
			System.out.print("\nPrimeiro número: ");
			numcal = sc.next();
			numver = numcal != null && ((numcal.matches("-?[0-9]+(\\.[0-9]+)") || numcal.matches("[0-9]+(\\.[0-9]+)"))
					|| (numcal.matches("[0-9]+") || numcal.matches("-?[0-9]+")));
			if (numver == true) {
				num = Double.parseDouble(numcal);
				validini = true;
				while (validini == true) {
					validini = false;
					System.out.print("\nSegundo número: ");
					numtwocal = sc.next();
					numtwover = numtwocal != null
							&& ((numtwocal.matches("-?[0-9]+(\\.[0-9]+)") || numtwocal.matches("[0-9]+(\\.[0-9]+)"))
									|| (numtwocal.matches("[0-9]+") || numtwocal.matches("-?[0-9]+")));
					if (numtwover == true) {
						numtwo = Double.parseDouble(numtwocal);
						validthree = true;
						while (validthree == true) {
							System.out.print(
									"\nQual operação você gostaria de fazer?\nPara Soma, digite 1\nPara Subração,"
											+ "digite 2\nPara multiplicação, digite 3\nPara Divisão, digite 4\n");
							optionthree = sc.next();
							verifica = optionthree != null && optionthree.matches("[0-9]+");
							if (verifica == true) {
								validthree = false;
								option = Integer.parseInt(optionthree);
								if (option.equals(1)) {
									resultado = num + numtwo;
									System.out.print("\nO resultado de (" + num + ") + (" + numtwo + ") é igual à: ("
											+ resultado + ")");
									retorno = teste.recursive();
									if (retorno.equals(1)) {
										validthree = false;
										valid = true;
									} else if (retorno.equals(2)) {
										validthree = false;
										valid = false;
										System.out.print("Volte sempre S2!");
									}
								} else if (option.equals(2)) {
									resultado = num - numtwo;
									System.out.print("\nO resultado de (" + num + ") - (" + numtwo + ") é igual à: ("
											+ resultado + ")");
									retorno = teste.recursive();
									if (retorno.equals(1)) {
										validthree = false;
										valid = true;
									} else if (retorno.equals(2)) {
										validthree = false;
										valid = false;
										System.out.print("Volte sempre S2!");
									}
								} else if (option.equals(3)) {
									resultado = num * numtwo;
									System.out.print("\nO resultado de (" + num + ") * (" + numtwo + ") é igual à: ("
											+ resultado + ")");
									retorno = teste.recursive();
									if (retorno.equals(1)) {
										validthree = false;
										valid = true;
									} else if (retorno.equals(2)) {
										validthree = false;
										valid = false;
										System.out.print("Volte sempre S2!");
									}
								} else if (option.equals(4)) {
									if (numtwo != 0) {
										resultado = num / numtwo;
										System.out.print("\nO resultado de (" + num + ") / (" + numtwo
												+ ") é igual à: (" + resultado + ")");
										retorno = teste.recursive();
										if (retorno.equals(1)) {
											validthree = false;
											valid = true;
										} else if (retorno.equals(2)) {
											validthree = false;
											valid = false;
											System.out.print("Volte sempre S2!");
										}
									} else {
										System.out.print(
												"Não há resultados lógicos numa divisão por zero!\nTente novamente!");
										retorno = teste.recursive();
										if (retorno.equals(1)) {
											validthree = false;
											valid = true;
										} else if (retorno.equals(2)) {
											validthree = false;
											valid = false;
											System.out.print("Volte sempre S2!");
										}
									}
								} else {
									System.out.print(
											"\n\"" + option + "\"" + " não é uma opção válida!\n\nTente novamente!\n");
									validthree = true;
								}
							} else {
								System.out.print(
										"\"" + optionthree + "\"" + "não é uma opção válida!\nTente novamente!\n");
								validthree = true;
							}
						}
					} else {
						System.out.print("\"" + numtwocal + "\"" + " não é uma opção válida!\nTente novamente!\n");
						validini = true;
					}
				}
			} else {
				System.out.print("\"" + numcal + "\"" + " não é uma opção válida!\nTente novamente!\n");
				valid = true;
			}
		}
		sc.close();
	}
}
