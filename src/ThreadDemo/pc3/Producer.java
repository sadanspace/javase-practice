package src.ThreadDemo.pc3;

public class Producer implements Runnable {
    private Goods goods;

    public Producer(Goods goods){
        this.goods = goods;
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            if(i%2==0){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.generateGoods("品牌A", "产品A");

            }else{
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.generateGoods("品牌B", "产品B");
            }
        }
    }

}
