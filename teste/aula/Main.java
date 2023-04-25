package br.com.residencia.poo.teste.aula;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Saldotest one = new Saldotest();
		BigDecimal valor = new BigDecimal(0);
		System.out.print("Defina o valor para depósito: ");
		valor = sc.nextBigDecimal();
		System.out.print(one.entrada(valor));
		//System.out.print("Seu saldo é: " + one.getSaldo());
		sc.close();
	}
}
