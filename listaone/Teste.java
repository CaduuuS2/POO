package br.com.residencia.poo.listaone;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		String entrada;
		boolean verifica;
		int entrado;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		entrada = sc.nextLine();
		verifica = entrada != null && entrada.matches("[0-9]+");
		System.out.print(verifica);
	}
}
