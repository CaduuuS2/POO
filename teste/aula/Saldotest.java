package br.com.residencia.poo.teste.aula;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Saldotest {
	BigDecimal saldo = new BigDecimal(0.00);
	NumberFormat padrao = NumberFormat.getCurrencyInstance();

	public void deposito(BigDecimal valor) {
		padrao.format(valor);
		this.saldo = this.saldo.add(valor);
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public boolean verificaEntrada(BigDecimal valor) {
		BigDecimal valor1 = valor.multiply(new BigDecimal(100));
		Integer valor2 = valor1.intValue();
		BigDecimal valor3 = new BigDecimal(valor2);
		if ((valor1.subtract(valor3)) == (valor1.subtract(valor1))) {
		return true;
		}
		else{
			return false;
		}

	}
}
