package br.com.bichobemcuidado.model;

public class Animal {
	private String nome;
	private String tipo;
	private String raca;
	private String cor;
	private GeneroAnimal genero;
	

	

	public Animal() {
		super();
	}
	public Animal(String nome, String tipo, String raca, String cor, GeneroAnimal genero, double peso) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.raca = raca;
		this.cor = cor;
		this.genero = genero;
		this.peso = peso;
	}
	public double peso;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public GeneroAnimal getGenero() {
		return genero;
	}
	public void setGenero(GeneroAnimal genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		
		return "Nome: " + this.nome + 
				" \n" + "Tipo: " + this.tipo + 
				" \n" + "Genero: " + this.genero +
				" \n" + "Cor: " + this.cor +
				" \n" + "Peso: " + this.peso +
				" \n" + "Raça: " + this.raca;
	}
	

}
