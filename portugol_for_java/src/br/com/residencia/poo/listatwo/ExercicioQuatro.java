package br.com.residencia.poo.listatwo;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		String nome;
		String apelido;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual é o seu nome? ");
		nome = sc.nextLine();
		System.out.print("Como você gostaria de ser chamado? ");
		apelido = sc.nextLine();
		System.out.print("Meus cumprimentos " + apelido + "!");
		sc.close();
	}
}
