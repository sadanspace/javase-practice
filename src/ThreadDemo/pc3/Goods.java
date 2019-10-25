package src.ThreadDemo.pc3;

public class Goods {
    private String brand;
    private String product;
    private Boolean isEmpty = true;
    private int length = 0;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public synchronized void generateGoods(String brand, String product) {
        this.setBrand(brand);
        this.setProduct(product);
        System.out.println("生产 品牌：" + this.getBrand() + " 产品：" + this.getProduct());
        length ++;
        if (length > 0) {
            isEmpty = false;
        }
        notify();
    }

    public synchronized void useGoods() {
        if (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("消费 品牌：" + this.getBrand() + " 产品：" + this.getProduct());
        length --;
        if (length < 1){
            isEmpty = true;
        }


    }
}
