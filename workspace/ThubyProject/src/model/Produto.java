package model;

public class Produto {
	
	private int codigo;
	private String ean;
	private String nome;
	private double valor;
	private int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(int codigo, String ean, String nome, double valor, int quantidade) {
		this.setCodigo(codigo);
		this.setEan(ean);
		this.setNome(nome);
		this.setValor(valor);
		this.setQuantidade(quantidade);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Marca getMarca_produto() {
		return marca_produto;
	}

	public void setMarca_produto(Marca marca_produto) {
		this.marca_produto = marca_produto;
	}

	Marca marca_produto = new Marca();
	
	void filtrarMarca() {
		print(marca_produto.nome);
	}
	
	public void print(String input) {
		System.out.println();
	}
	
	@Override
	public String toString() {
		return this.codigo + " " + this.nome + ".";
	}
}