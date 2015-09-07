package br.org.catolica;

import org.junit.Test;

public class Teste2 {

	private ValidaTriangulo valida;

	@Test
	public void test() {
		int a = 1;
		int b = 1;
		int c = 1;
		
		setValida(new ValidaTriangulo(a, b, c));
	}

	public ValidaTriangulo getValida() {
		return valida;
	}

	public void setValida(ValidaTriangulo valida) {
		this.valida = valida;
	}

}
