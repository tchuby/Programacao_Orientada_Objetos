import java.util.ArrayList;

public class Produto {
    private String nome;
    private String descricao;
    private double valor;
    private int quantidade;

    public String getNome(){
        return this.nome;
    }

    public boolean setNome(String nome){
        nome.trim();
        if(nome.equals(""))
            return false;
        if(!this.nome.equals(nome))
            this.nome = nome;
        return true;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
