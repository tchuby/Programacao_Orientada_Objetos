import java.util.Scanner;

public class GerenciadorDeEstoque {
    private static final int _numeroDeElementos = 20;
    private static Produto[] estoque = new Produto[_numeroDeElementos];
    private static Scanner _leitor = new Scanner(System.in);

    public static void main(String[] args){
        Boolean controle = true;

        for(int i = 0; i < _numeroDeElementos; i++){
            while(controle){
                imprimir("Informe o nome do produto: ");
                controle = (!estoque[i].setNome(_leitor.nextLine())
                                         && produtoTemNomeUnico(i));
            }
        }

        _leitor.close();
    }

    static private boolean produtoTemNomeUnico(int posicaoProduto){
        boolean comparacao = true;

        for(int i = 0; i < posicaoProduto; i++){
            if(estoque[i].getNome().equals(estoque[posicaoProduto].getNome())){
                comparacao = false;
                imprimir("Produto já cadastrado.");
                break;
            }
        }

        return comparacao;
    }
    private static void imprimir(String texto){
        System.out.println(texto);
    }
}
