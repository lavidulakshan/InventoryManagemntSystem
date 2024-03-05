
package modal;


public class GrnReturn {
     private String stockid;
    private String name;
    private String brand;
    private double  price;
    private int qty;

    
    public String getStockid() {
        return stockid;
    }

   
    public void setStockid(String stockid) {
        this.stockid = stockid;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public String getBrand() {
        return brand;
    }

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

   
    public double getPrice() {
        return price;
    }

  
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
