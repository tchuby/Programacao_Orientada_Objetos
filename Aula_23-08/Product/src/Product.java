public class Product {
    private String name;
    private double price;
    private int stock;

    public Product() {}

    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    };

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean withdrawalFromStock(int withdrawal){
        if((this.stock < withdrawal)&&(withdrawal > 0))
        {
            System.out.println("O estoque não pode ficar negativo.");
            return false;
        }

        this.stock += withdrawal;
        return true;
    }

    public boolean depositInStock(int deposit){
        if(deposit < 0){
            System.out.println("O depósito deve ser um valor positivo");
            return false;
        }

        this.stock += deposit;
        return true;
    }
}
