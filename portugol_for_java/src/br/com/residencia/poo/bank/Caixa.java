package br.com.residencia.poo.bank;

public class Caixa extends Funcionario {
	
	public Caixa() {

	}

	public Caixa(String nome, String cargo, String cpf, String codigo, Double salario, Double bonificacao) {
		this.getNome();
		this.getCargo();
		this.getCpf();
		this.getCodigo();
		this.getSalario();
		this.getBonificacao();
	}
	
}
