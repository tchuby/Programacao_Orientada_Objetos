package model;

import java.util.ArrayList;

public class Estoque {
	private ArrayList<Produto> estoque;
	
	public Estoque() {
		this.estoque = new ArrayList<>();
	}
	
	public ArrayList<Produto> getEstoque(){
		return this.estoque;
	}
}
