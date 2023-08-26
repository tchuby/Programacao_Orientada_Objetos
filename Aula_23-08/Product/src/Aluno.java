public class Aluno {
    private String nome;
    private double nota1;
    private boolean nota1Atribuida = false;
    private double nota2;
    private boolean nota2Atribuida = false;
    private double nota3;
    private boolean nota3Atribuida = false;
    private double media;

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        if(validarNota(nota1)){
            this.nota1 = nota1;
            this.nota1Atribuida = true;
        }
    }

    public void setNota2(double nota2) {
        if(validarNota(nota2)){
            this.nota2 = nota2;
            this.nota2Atribuida = true;
        }
    }

    public void setNota3(double nota3) {
        if(validarNota(nota3)){
            this.nota3 = nota3;
            this.nota3Atribuida = true;
        }
    }

    private boolean validarNota(double nota){
        if(nota > 10.0)
            System.out.println("A nota não pode ser superior a 10.");
        else if(nota < 0.0)
            System.out.println("A nota não pode ser menor que 0");
        else
            return true;

        return false;
    }

    public void calcularMedia(){
        if(!nota1Atribuida || !nota2Atribuida || !nota3Atribuida)
            System.out.println("Uma das notas não foi atribuída.");

        this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    @Override
    public String toString(){
        return "O aluno " + this.nome + " obteve as notas:\n"
                + nota1 + "; \n"
                + nota2 + "; \n"
                + nota3 + ";e \n"
                + "sua média foi: " + this.media + ".";
    }
}
