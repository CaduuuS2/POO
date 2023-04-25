package br.com.residencia.poo.bank;

public class Gerente extends Funcionario {
	private String senha;

	public Gerente() {

	}

	public Gerente(String nome, String cargo, String cpf, String codigo, Double salario, Double bonificacao,
			String senha) {
		this.getNome();
		this.getCargo();
		this.getCpf();
		this.getCodigo();
		this.getSalario();
		this.getBonificacao();
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

}
