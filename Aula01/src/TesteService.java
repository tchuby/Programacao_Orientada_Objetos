public class TesteService implements ITesteService {
    private boolean falso;
    private int numero;

    private String nome;

    public TesteService(){

    }

    public TesteService(boolean falso, int numero, String nome){
        this.falso = falso;
        this.numero = numero;
        this.nome = nome;
    }

    public void setFalso(boolean falso){
        this.falso = falso;
    }

    public Boolean getFalso(){
        return this.falso;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public boolean testeNome(String nome) {
        return this.nome.equals(nome);
    }
}
