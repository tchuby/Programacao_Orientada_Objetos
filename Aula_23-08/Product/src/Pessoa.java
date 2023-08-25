public class Pessoa {
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0)
            this.idade = idade;
        else
            System.out.println("A idade deve ser maior ou igual a zero.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome
                + ";\nIdade: " + this.idade + ".";
    }
}
