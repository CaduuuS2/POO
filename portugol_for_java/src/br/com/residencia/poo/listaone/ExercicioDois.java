package br.com.residencia.poo.listaone;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade1;
		int idade2;
		int idade3;
		int idade4;
		int idade5; 
		int suaidade;
		System.out.print("Qual é a idade do colega 1? ");
		idade1 = scanner.nextInt();
		System.out.print("Qual é a idade do colega 2? ");
		idade2 = scanner.nextInt();
		System.out.print("Qual é a idade do colega 3? ");
		idade3 = scanner.nextInt();
		System.out.print("Qual é a idade do colega 4? ");
		idade4 = scanner.nextInt();
		System.out.print("Qual é a idade do colega 5? ");
		idade5 = scanner.nextInt();
		System.out.print("Qual é a sua idade? ");
		suaidade = scanner.nextInt();
		int soma = idade1 + idade2 + idade3 + idade4 + idade5 + suaidade;
		System.out.print("A soma do seu tempo de vida com o dos seus colegas é: " + soma);
		scanner.close();

	}

}
