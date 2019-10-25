package src.ThreadDemo.pc4;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Goods> blockingQueue;

    public Consumer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Goods goods = blockingQueue.take();
                System.out.println("消费 品牌：" + goods.getBrand() + " 产品：" + goods.getProduct());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
