package br.com.residencia.poo.listatwo;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		int produto;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos produtos você gostaria de comprar? ");
		produto = sc.nextInt();
		System.out.print("Parabéns por comprar " + produto + "produtos!");
		sc.close();
	}
}
