import java.util.Scanner;

public class AppAluno {
    private static Scanner _leitor = new Scanner(System.in);
    public static void main(String[] args){
        interagir();
        _leitor.close();
    }
    public static void interagir(){
        Aluno aluno = new Aluno();
        print("Entre com o nome do aluno: ");
        aluno.setNome(_leitor.nextLine());

        print("Entre com a 1ª nota do aluno: ");
        aluno.setNota1(Double.parseDouble(_leitor.next()));

        print("Entre com a 2ª nota do aluno: ");
        aluno.setNota2(Double.parseDouble(_leitor.next()));

        print("Entre com a 3ª nota do aluno: ");
        aluno.setNota3(Double.parseDouble(_leitor.next()));

        print(aluno.toString());
    }
    public static void print(String message){
        System.out.println(message);
    }
}
