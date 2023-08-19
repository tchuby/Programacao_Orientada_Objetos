package Model;

import java.util.List;

public class Order {
    private Integer id;
    private Integer code;
    private Client client;
    public List<Product> products;

    public Order() {

    }

    public void setId(int id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
