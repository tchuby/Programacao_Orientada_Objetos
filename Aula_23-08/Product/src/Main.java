public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("PC desktop", 2000.00);
        Product product2 = new Product( "smartphone", 1000.00);

        print("O nome do produto 1 é: " + product1.getName());
        print("O preço do produto 1 é: " + product1.getPrice());
        print("O nome do produto 2 é: " + product2.getName());
        print("O preço do produto 2 é: " + product2.getPrice());

        product1.setName("notebook");
        product1.setPrice(3000.00);
        product2.setName("mouse");
        product2.setPrice(50.00);

        print("O nome do produto 1 é: " + product1.getName());
        print("O preço do produto 1 é: " + product1.getPrice());
        print("O nome do produto 2 é: " + product2.getName());
        print("O preço do produto 2 é: " + product2.getPrice());
    }
    public static void print(String message){
        System.out.println(message);
    }
}