package aplication;

import java.util.ArrayList;
import java.util.Scanner;

import model.Produto;

public class Start {
	
	private static Scanner _reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Produto> itens = new ArrayList<Produto>();
		
		Produto produto;
		boolean controle = true;
		
		while(controle) {
			
			print("Codigo: ");
			var codigo = _reader.nextInt();
			
			if(codigo <= 0) {
				controle = false;
				break;
			}
			
			print("Ean: ");
			var ean = _reader.next();
			
			print("Nome: ");
			var nome = _reader.next();
			
			print("Quantidade: ");
			var quantidade = _reader.nextInt();
			
			print("Valor: ");
			var valor = _reader.nextDouble();
			
			produto = new Produto(codigo, ean, nome, valor, quantidade);
			itens.add(produto);
		}
		
		for(int i = 0; i < itens.size(); i++) {
			print(itens.get(i).toString());
		}
		
		_reader.close();
	}
	
	private static void print(String message) {
		System.out.println(message);
	}
}