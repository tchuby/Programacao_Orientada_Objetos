import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> stock = new ArrayList<Product>();

    private ArrayList<Product> getStock(){
        return stock;
    }

    public double getTotalValue(){
        var goods = getStock();
        var totalValue = 0.0;
        for(Product good: goods){
            totalValue += (good.getPrice() * good.getQuantity());
        }
        return totalValue;
    }

    public Integer getTotalItems(){
        var goods = getStock();

        var totalItems = 0;
        for(Product good: goods){
            totalItems += (good.getQuantity());
        }

        return totalItems;
    }

    public double getAverage(){
        return (this.getTotalValue() /this.getTotalItems());
    }

    public String getRunningOutProducts(){
        var goods = getStock(); 

        var runnigOutNames = new StringBuilder("");

        for(int i = 0; i < goods.size(); i++ ){
            if(goods.get(i).getQuantity() <= 5){
                
                runnigOutNames.append(goods.get(i).getName()).append(" ");
            }
        }
        
        return runnigOutNames.toString().trim();
    }

    public Double getTotalValueOfRunningOutProducts(){
        var goods = getStock(); 

        Double runnigOutTotalValue = 0.0;

        for(int i = 0; i < goods.size(); i++ ){
            if(goods.get(i).getQuantity() <= 5){
                runnigOutTotalValue += (goods.get(i).getPrice() * goods.get(i).getQuantity());
            }
        }

        return runnigOutTotalValue;
    }
    
    public void storeProduct(Product product) throws Exception{
        var goods = getStock();

        for(Product good: goods){
            if(good.getName().equals(product.getName())){
                throw new Exception("Produto já cadastrado.");
            }
        }

        this.stock.add(product);
    }
}
