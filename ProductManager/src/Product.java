public class Product {

    private String name = "";
    private String description = "";
    private double price;
    private int quantity;

    public Product(){}
    
    public boolean setName(String name) throws Exception{
        name.trim();
        if(!this.name.equals(name)){
            this.name = name;
            return true;
        }
        throw new Exception("O nome não pode ser vazio.");
    }

    public String getName(){
        return this.name;
    }

    public boolean setDescription(String description) throws Exception{
        description.trim();
        if(!this.description.equals(description)){
            this.description = description;
            return true;
        }
        throw new Exception("Descrição não pode ser vazia.");
    }

    public String getDescription(){
        return this.description;
    }

    public boolean setPrice(Double price) throws Exception{
        if(price >= 0){
            this.price = price;
            return true;
        }
        throw new Exception("Preço não pode ser menor que 0.");
    }

    public Double getPrice(){
        return this.price;
    }

    public boolean setQuantity(Integer quantity) throws Exception{
        if(quantity >= 0){
            this.quantity = quantity;
            return true;
        }
        throw new Exception("Quantidade não pode ser menor que 0.");
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public boolean compareProduct(Product product){
        if(this.name == product.name){
            return true;
        }
        return false;
    }
}
