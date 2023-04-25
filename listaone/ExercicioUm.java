package br.com.residencia.poo.listaone;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		String nome;
		String sobrenome;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual é o seu nome? ");
		nome = sc.nextLine();
		System.out.print("Qual é seu sobrenome? ");
		sobrenome = sc.nextLine();
		System.out.print("Seja bem vinda(o) " + nome + " " + sobrenome + "!");
		sc.close();
	}
}
