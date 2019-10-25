package src.ThreadDemo.pc2;

public class Goods {
    private String brand;
    private String product;

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getProduct(){
        return this.product;
    }

    public void  setProduct(String product){
        this.product = product;
    }

    public synchronized void generateGoods(String brand, String product){
        this.setBrand(brand);
        this.setProduct(product);
    }
}
