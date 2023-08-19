package Model;

public class Product {
    public Integer id;
    public String name;
    public String category;
    public String brand;
    public Double price;
    public Integer skuId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
