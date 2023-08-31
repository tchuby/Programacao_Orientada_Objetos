package Main;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	private static Scanner _leitor = new Scanner(System.in);
	private static Estoque _estoque = new Estoque();
	
	public static void main(String[] args) {
		interagir();
		_leitor.close();
	}
	
	private static void interagir() {
		String nome = "", descricao = "";
		double valor = 0.0;
		int quantidade = 0;
		boolean controle = true;
		
		imprimir("Quantos produtos deseja cadastrar? ");
		var quantidadeCadastrar = validarInteger(_leitor.next());
		
		for(int i = 0; i < quantidadeCadastrar; i++) {
			
				imprimir("Cadastrar produto nº" + (i+1) + " no estoque. \n");
				imprimir("Digite o nome do produto: ");
				nome = _leitor.nextLine();
				imprimir("Digite a descrição do produto: ");
				descricao = _leitor.nextLine();
				imprimir("Digite o valor do produto: ");
				valor = validarDouble(_leitor.next());
				imprimir("Digite a quantidade do produto: ");
				quantidade = validarInteger(_leitor.next());
				
				cleanConsole();
				
				cadastrarProduto(nome, descricao, valor, quantidade);	
		}
		
		
		imprimir("O somatório dos valores dos produtos no estoque é: \nR$ " + formatarDouble(_estoque.getMontante()));
		imprimir("O valor médio dos produtos é: \nR$ " + formatarDouble(_estoque.getValorMedio()));
		imprimir("O total de todos os produtos é: " + _estoque.getQuantidadeTotal());
		imprimir("Os produtos acabando são: " + _estoque.lerProdutosAcabando() + ".");
		imprimir("O somatório dos valores dos produtos acabando é: " + formatarDouble(_estoque.lerValorDosProdutosAcabando()));
	}
	
	private static boolean cadastrarProduto(String nome, String descricao,double valor, int quantidade) 
	{	
			var produto = new Produto();
			
			if(!produto.setValor(valor) || !produto.setQuantidade(quantidade) ) {
				return false;
			}
				
			produto.setNome(nome);
			
			produto.setDescricao(descricao);
			
			if(_estoque.adicionarProduto(produto)) {
				return true;
			}
		
			imprimir("Dados inválidos, cadastre o produto novamente.");
			return false;
	}
	
	
	
    private static void imprimir(String texto){
        System.out.println(texto);
    }
    
    private static String formatarDouble(Double number){
        return new DecimalFormat("#,##0.00")
                            .format(number).toString();
    }
    
    private static Double validarDouble(String entrada){
        double saidaDouble = 0.00;
        boolean controleFluxo = true;

        while(controleFluxo){
            var modifiedInput = entrada.replace(',', '.');
            try{
                saidaDouble = Double.parseDouble(modifiedInput);
                controleFluxo = false;
            }
            catch(NumberFormatException exception){
                imprimir("Caracter inválido, tente novamente.");
                entrada = _leitor.next();
            }
        }
        return saidaDouble;
    }

    private static void cleanConsole(){
        try{
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        }
        catch(IOException ioException){
            imprimir("");
        }
        catch(InterruptedException interrupted){
            imprimir("");
        }
    }

    private static Integer validarInteger(String input){
        int outInt = 0;
        boolean controlFlow = true;

        while(controlFlow){
            try{
                outInt = Integer.parseInt(input);
                controlFlow = false;
            }
            catch(NumberFormatException exception){
            	imprimir("Caracter inválido, tente novamente.");
            	imprimir("Use apenas números inteiros");
                input = _leitor.next();
            }
        }
        return outInt;
    }
}
