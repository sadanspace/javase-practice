package src.ThreadDemo.pc2;

public class Consumer implements Runnable {
    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费 品牌：" + goods.getBrand() + " 产品：" + goods.getProduct());
        }
    }
}
