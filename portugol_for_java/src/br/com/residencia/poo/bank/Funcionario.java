package br.com.residencia.poo.bank;

public abstract class Funcionario {
	private String nome;
	private String cargo;
	private String cpf;
	private String codigo;
	private Double salario;
	private Double bonificacao;

	public String getNome() {
		return this.nome;
	}

	public String getCargo() {
		return this.cargo;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCodigo() {
		return codigo;
	}

	public Double getSalario() {
		return salario;
	}

	public Double getBonificacao() {
		return bonificacao;
	}
}
