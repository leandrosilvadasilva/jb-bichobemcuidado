package br.com.bichobemcuidado.model;

public enum GeneroAnimal {
	MACHO(1), FEMEA(2);

	private int valor;

	GeneroAnimal(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
}
