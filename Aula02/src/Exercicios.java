import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicios {
    private Scanner _reader = new Scanner(System.in);
    public void exercicio1(){
        //Exercício nº1
        print("Olá mundo!\n");
    }

    public void exercicio2(){
        print("Digite dois números e saiba sua soma.");
        print("Digite o primeiro número: ");
        var numero1 = validateInteger(_reader.next());

        print("Digite o segundo número: ");
        var numero2 = validateInteger(_reader.next());

        var resultado = numero1 + numero2;

        print("A soma dos números é: " + resultado + ".");
    }

    public void exercicio3(){
        Double resultadoMedia = 0.0;
        print("Digite a primeira nota do aluno: ");
        var nota1 = validateDouble(_reader.next());
        print("Digite a segunda nota do aluno: ");
        var nota2 = validateDouble(_reader.next());
        print("Digite a terceira nota do aluno: ");
        var nota3 = validateDouble(_reader.next());

        resultadoMedia = (nota1 + nota2 + nota3)/3;

        print("A media do aluno foi de: " + formatDouble(resultadoMedia));
    }

    public void exercicio4(){
        print("Digite um número e saiba se é par ou ímpar: ");
        var entrada = validateInteger(_reader.next());

        var resto = entrada % 2;

        var saida = "O número " + entrada + " é ";

        if(resto == 0){
            print(saida + "par.");
        }
        else {
            print(saida + "impar.");
        }
    }

    public void exercicio5(){
        print("Digite um número e saiba se é negativo, positivo ou 0: ");
        var entrada = validateInteger(_reader.next());
        var resultado = "";

        if(entrada > 0){
            resultado = "positivo";
        }
        else if (entrada < 0){
            resultado = "negativo";
        }
        else{
            resultado = "0";
        }
        print("O número é: " + resultado + ".");
    }

    public void exercicio6(){
        print("Digite a idade de uma pessoa e saiba se é maior de idade: ");
        var entrada = validateInteger(_reader.next());

        var resultado = "";

        if(entrada < 18)
            resultado = "menor";
        else
            resultado = "maior";

        print("A pessoa é " + resultado + " de idade.");
    }

    public void exercicio7(){
        Integer maior = Integer.MIN_VALUE, entrada = 0;
        for(int i = 0; i < 3; i++){
            print("Digite o " + (i+1) + "º número: ");
            entrada = validateInteger(_reader.next());
            if(entrada >= maior)
                maior = entrada;
        }
        print("O maior número é o : " + maior + ".");
    }

    public void exercicio8(){

        print("Digite o nome da pessoa: ");
        var nome = _reader.nextLine();

        print("Digite a idade da pessoa: ");
        var idade = validateInteger(_reader.next());

        var resultado = "";

        if(idade < 65)
            resultado = "não";

        print(nome + " possui "+ idade + " anos de idade e "
                + resultado + " pode se aposentar.");
    }

    public void exercicio9(){
        boolean isAproved;


    }

    public void exercicio13(){
        boolean aprovado = false;
        print("O aluno está aprovado?"
                +"\nDigite (1) para sim e (0) para não:");
        aprovado = validateBoolean();

        var resultado = "";

        if(!aprovado)
            resultado = " não";

        print("O aluno" + resultado + " foi aprovado.");

    }

    public void produtoFatorial(){
        print("Digite um número e saiba seu produto fatorial.");
        int input  = validateInteger(_reader.next());
        print("O valor de " + input + "! é: " + fatorial(input) + ".");
    }
    private int fatorial(int value){
        if(value == 0)
            return 1;
        else
            return value * fatorial(value - 1);
    }

    public void exercicio24(){
        int soma = 0;
        print("Digite um número inteiro e saiba a soma dos seus algarismos.");
        print("Digite o número:");
        String input = Integer.toString((validateInteger(_reader.next())));
        for(int i = 0; i < input.length(); i++){
            soma = soma + Integer.parseInt(Character.toString(input.charAt(i)));
        }
        print("A soma dos algarismos do número " + input + " é: " + soma + ".");
    }

    public void print(String output){
        System.out.println(output);
    }

    public Boolean validateBoolean(){
        boolean outBool = false,
                controlFlow = true;

        do{
            try{
                outBool = _reader.nextBoolean();
                controlFlow = false;
            }
            catch(InputMismatchException exception){
                print("Caracter inválido, tente novamente.");
                print("Use apenas 0 ou 1");
            }
        }while(controlFlow);
        return outBool;
    }

    public Integer validateInteger(String input){
        int outInt = 0;
        boolean controlFlow = true;

        while(controlFlow){
            try{
                outInt = Integer.parseInt(input);
                controlFlow = false;
            }
            catch(NumberFormatException exception){
                print("Caracter inválido, tente novamente.");
                print("Use apenas números inteiros");
                input = _reader.next();
            }
        }
        return outInt;
    }
    public Double validateDouble(String input){
        double outDouble = 0.00;
        boolean controlFlow = true;

        while(controlFlow){
            var modifiedInput = input.replace(',', '.');
            try{
                outDouble = Double.parseDouble(modifiedInput);
                controlFlow = false;
            }
            catch(NumberFormatException exception){
                print("Caracter inválido, tente novamente.");
                input = _reader.next();
            }
        }
        return outDouble;
    }

    public String formatDouble(Double number){
        String numberFormated = new DecimalFormat("#,##0.00")
                .format(number).toString();
        return numberFormated;
    }
}
