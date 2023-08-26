import java.util.Scanner;

public class AppProduct {
    private static Scanner _reader = new Scanner(System.in);
    public static void main(String[] args){
        interact();
        _reader.close();
    }
    private static void interact(){
        boolean control1 = true, control2 = true;
        var product = new Product("Mariola", 0.5, 10);

        while(control1){
            print("Valor a ser depositado no estoque:");
            control1 = !product.depositInStock(Integer.parseInt(_reader.next()));
        }

        while(control2){
            print("Valor a ser retirado do estoque:");
            control2  = !product.withdrawalFromStock(Integer.parseInt(_reader.next()));
        }

        print("O estoque de " + product.getName() + " é de " + product.getStock() + " unidades.");

    }
    private static void print(String message){
        System.out.println(message);
    }
}
