package br.org.catolica;

import org.junit.Test;

public class Teste3 {

	private ValidaTriangulo valida;

	@Test
	public void test() {
		int a = 1;
		int b = 2;
		int c = 3;
		
		setValida(new ValidaTriangulo(a, b, c));
	}

	public ValidaTriangulo getValida() {
		return valida;
	}

	public void setValida(ValidaTriangulo valida) {
		this.valida = valida;
	}

}
