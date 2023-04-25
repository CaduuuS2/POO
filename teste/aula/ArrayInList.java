package br.com.residencia.poo.teste.aula;

import java.util.Scanner;

public class ArrayInList {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int settamanho = 5;
		int tamanho = 5;
		int cont = -1;
		int cont2 = 0;
		Scanner sc = new Scanner(System.in);
		// settamanho = sc.nextInt();
		sc.close();
		String[] booora = new String[tamanho];

		// for (i = 0; i < settamanho; i++) {
		// booora[i] = " @";
		// }
		booora[0] = "q";
		booora[1] = "1";
		booora[2] = "c";
		booora[3] = "1";
		booora[4] = "w";
		for (i = 0; i < tamanho; i++) {
			if (booora[i].equals("1")) {
				cont += 1;
			} else {
				cont2+=1;
				for (j = cont2; j < tamanho; j++) {
					booora[j] = booora[i];
					break;
				}
			}
			
			for (i = 0; i < tamanho; i++) {
				System.out.print(booora[i]);
			}
		}
	}
}