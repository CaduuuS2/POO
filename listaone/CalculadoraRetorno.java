package br.com.residencia.poo.listaone;

import java.util.Scanner;

public class CalculadoraRetorno {

	Scanner sc = new Scanner(System.in);
	String optiontwoo;
	Integer retorno;
	Integer optiontwo = 0;
	boolean validtwo = true;
	boolean verificadois;

	public Integer recursive() {
		validtwo = true;
		while (validtwo == true) {
			System.out.print("\n\nPara reiserir digite 1\nPara finalizar programa digite 2\n");
			optiontwoo = sc.next();
			verificadois = optiontwoo != null && optiontwoo.matches("[0-9]+");
			if (verificadois == true) {
				optiontwo = Integer.parseInt(optiontwoo);
				if (optiontwo.equals(1)) {
					validtwo = false;
					retorno = 1;
				} else if (optiontwo.equals(2)) {
					validtwo = false;
					retorno = 2;
				} else {
					System.out.print("\n\"" + optiontwo + "\"" + " não é uma opção válida!\n\nTente novamente!\n");
					validtwo = true;
				}
			} else {
				System.out.print("\"" + optiontwoo + "\"" + " não é uma opção válida!\nTente novamente!\n");
				validtwo = true;
			}
		}
		if (retorno == 1) {
			return 1;
		}
		else {
			return 2;
		}
	}
}