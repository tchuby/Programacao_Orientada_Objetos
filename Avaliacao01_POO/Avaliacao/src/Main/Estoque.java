package Main;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	private ArrayList<Produto> estoque = new ArrayList<Produto>();
	private double montante;
	private double valorMedio;
	private int quantidadeTotal;
	
	public List<Produto> getEstoque() {
		return estoque;
	}
	
	public double getMontante() {
		return montante;
	}
	
	public double getValorMedio() {
		double totalPreco = 0.0;
		var produtosEmEstoque = getEstoque();
		
		for(Produto p: produtosEmEstoque) {
			totalPreco += p.getValor();
		}
		
		this.valorMedio = totalPreco / estoque.size();
		
		return this.valorMedio;
	}
	
	public int getQuantidadeTotal() {
		int totalItens = 0;
		var produtosEmEstoque = getEstoque();
		
		for(Produto p: produtosEmEstoque) {
			totalItens += p.getQuantidade();
		}
		this.quantidadeTotal = totalItens;
		return this.quantidadeTotal;
	}
	
	public String lerProdutosAcabando() {
		String nomes = "";
		var produtosEmEstoque = getEstoque();
		
		for(Produto p: produtosEmEstoque) {
			if(p.getQuantidade() <= 5)
			nomes += p.getNome() + " ";
		}
		
		return nomes;
	}
	
	public double lerValorDosProdutosAcabando() {
		double valor = 0.0;
		
		var produtosEmEstoque = getEstoque();
		
		for(Produto p: produtosEmEstoque) {
			if(p.getQuantidade() <= 5)
			valor += (p.getValor() * p.getQuantidade());
		}
		
		return valor;
	}
	
	public boolean adicionarProduto(Produto produto) {
		var produtosEmEstoque = getEstoque();
		
		for(Produto p: produtosEmEstoque) {
			if(p.getNome().equals(produto.getNome())) {
				System.out.println("Produto já cadasrado.");
				return false;
			}
		}
		
		this.estoque.add(produto);
		
		this.montante += (produto.getValor() * produto.getQuantidade());
		
		return true;
	}
	
}
