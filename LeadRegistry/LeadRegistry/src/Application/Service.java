package Application;

import java.util.Scanner;
import Data.LeadsRepository;

public class Service {
	
	private LeadsRepository repository;
	private Scanner reader;
	private Utils utils;
	
	public Service(LeadsRepository repository, Scanner reader) {
		
		this.repository = repository;
		this.reader = reader;
		
		utils = new Utils(reader);
	}
	
	public void interact() {
		boolean controlFlow = true;
		
		while(controlFlow) {
			
			showPanel();
			controlFlow = callFunction(utils.validateInteger(reader.next()));
			
		}
	}
	
	private boolean callFunction(int option) {
		var controlFlow = true;
		
		switch(option) {
		case 1: 
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			controlFlow = false;
			print("Saindo da aplicação...");
			break;
		default:
			print("Opção inválida.");
			break;
		}
		
		return controlFlow;
	}
	
	public void showPanel() {
		print("MENU: \n");
		print("1 - Cadastrar;");
		print("2 - Listar;");
		print("3 - Listar por produto;");
		print("4 - Listar por nome;");
		print("5 - Sair");
	}
	
	private void print(String message) {
		System.out.println(message);
	}
}
