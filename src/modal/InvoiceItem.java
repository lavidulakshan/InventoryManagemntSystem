
package modal;

import gui.*;


public class InvoiceItem {
    
    private String stockid;
    private String brand;
    private String name;
    private String qty;
    private String sellingprice;
    private String mfg;
    private String exp;

    
    public String getStockid() {
        return stockid;
    }

    
    public void setStockid(String stockid) {
        this.stockid = stockid;
    }

   
    public String getBrand() {
        return brand;
    }

   
    public void setBrand(String brand) {
        this.brand = brand;
    }

   
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getQty() {
        return qty;
    }

    
    public void setQty(String qty) {
        this.qty = qty;
    }

    
    public String getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(String sellingprice) {
        this.sellingprice = sellingprice;
    }

  
    public String getMfg() {
        return mfg;
    }

    
    public void setMfg(String mfg) {
        this.mfg = mfg;
    }

    
    public String getExp() {
        return exp;
    }

    
    public void setExp(String exp) {
        this.exp = exp;
    }
    
}
