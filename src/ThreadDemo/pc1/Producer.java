package src.ThreadDemo.pc1;

public class Producer implements Runnable {
    private Goods goods;

    public Producer(Goods goods){
        this.goods = goods;
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            if(i%2==0){
                goods.setBrand("品牌A");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setProduct("产品A");
                System.out.println("生产 品牌："+goods.getBrand()+" 产品：" +goods.getProduct());
            }else{
                goods.setBrand("品牌B");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setProduct("产品B");
                System.out.println("生产 品牌："+goods.getBrand()+" 产品：" +goods.getProduct());
            }
        }
    }
}
