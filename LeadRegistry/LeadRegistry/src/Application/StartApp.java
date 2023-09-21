package Application;

import java.util.Scanner;

import Data.LeadsRepository;

public class StartApp {
	
	/*
	 	Como um usuário de aplicações CLI (Comand Line Interface) eu 
		necessito gerenciar a lista de Leads(Clientes Potenciais) e 
		ter acesso âs informações do nome, email, telefone e produto
		de interesse

		Critérios de aceite
			- a aplicação deve permitir a inclusão de novos Leads informando
		o nome, o email, o telefone e o produto de interesse;
			- a aplicação deve permitir a listagem de todos os Leads cadastrados;
			- a aplicação deve permitir o filtro de um grupo de Leads de acordo 
		com o tipo do produto de interesse;
		- a aplicação deve permitir pesquisar um Lead pelo nome.
	  */
	
	private static Scanner reader = new Scanner(System.in);
	private static LeadsRepository repository = new LeadsRepository();
	private static final Service service = new Service(repository, reader);
	
	public static void main(String[] args) {
		
		service.interact();
		
		reader.close();
		
	}
}
