import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    private static Inventory _inventory = new Inventory();

    private static Scanner _reader = new Scanner(System.in);

    private final static int _elementsQuantity = 3;

    public static void main(String[] args) throws Exception {
        interact();
       _reader.close();
    }

    public static void interact(){

        for(int i = 0; i < _elementsQuantity; i++){

            boolean result;

            do{
                print("Entre com os dados do " + (i + 1) + "º produto.");

                result = insertProductData();

            }while(!result);
        }

        print("O valor total do estoque é de: R$" + formatDouble(_inventory.getTotalValue()) + "\n");

        print("O valor médio do estoque é de : R$ " + formatDouble(_inventory.getAverage()) + "\n");

        print("A quantidade total de produtos é de: " + _inventory.getTotalItems() + ".\n");

        print("Os produtos com menos de 5 unidades são: " + _inventory.getRunningOutProducts() + "\n");

        print("O valor total dos produtos com menos de 5 unidades em estoque é de: R$ "
         + formatDouble(_inventory.getTotalValueOfRunningOutProducts()) + "\n");
    }

    private static boolean insertProductData(){
        Product product = new Product();

        try{
            print("Digite o nome do produto: ");
            product.setName(_reader.nextLine());
            
            print("Digite a descrição do produto: ");
            product.setDescription(_reader.nextLine());

            print("Digite o valor do produto: ");
            product.setPrice(validateDouble(_reader.nextLine()));

             print("Digite a quantidade do produto: ");
            product.setQuantity(validateInteger(_reader.nextLine()));

            _inventory.storeProduct(product);
            return true;
        }
        catch(Exception exc){
            print("Dados inválidos: \n" + exc.getMessage());
            return false;
        }
    }

    private static void print(String input){
        System.out.println(input);
    }

    private static String formatDouble(Double number){
        String numberFormated = new DecimalFormat("0.00")
                .format(number).toString();
        return numberFormated;
    }

    private static Double validateDouble(String input){
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
    
    private static Integer validateInteger(String input){
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
}