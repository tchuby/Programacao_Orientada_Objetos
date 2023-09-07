public class Produto {
	
	private String nome;
	private String descricao;
	private double valor;
	private int quantidade;
	
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public boolean setQuantidade(int quantidade){
		if(quantidade < 0) {
			System.out.println("A quantidade não pode ser negativa.");
			return false;
		}
		else {
			this.quantidade = quantidade;
			return true;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public boolean setValor(double valor) {
		if(valor < 0) {
			System.out.println("O valor não pode ser negativa.");
			return false;
		}
		else {
			this.valor = valor;
			return true;
		}
	}
}
