package src.ThreadDemo.pc2;

public class Producer implements Runnable {
    private Goods goods;

    public Producer(Goods goods){
        this.goods = goods;
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            if(i%2==0){
                goods.generateGoods("品牌A", "产品A");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("生产 品牌："+goods.getBrand()+" 产品：" +goods.getProduct());
            }else{
                goods.generateGoods("品牌B", "产品B");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("生产 品牌："+goods.getBrand()+" 产品：" +goods.getProduct());
            }
        }
    }

}
