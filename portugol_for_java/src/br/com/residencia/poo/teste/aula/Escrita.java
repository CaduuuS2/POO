package br.com.residencia.poo.teste.aula;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrita {
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	static String nome = "caduzada";
	BufferedWriter buffWrite;
	String linha = "";
	static Scanner sc = new Scanner(System.in);

	public static void escritor() throws IOException {
		System.out.println("Escreva o nome do arquivo: ");
		nome = sc.nextLine();
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome));
	}

	public void escrita() throws IOException {
		System.out.println("Escreva algo: ");
		linha = sc.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}
}
