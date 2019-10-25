package src.ThreadDemo.pc4;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue blockingQueue;

    public Producer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                blockingQueue.add(new Goods("品牌A", "产品A"));
            } else {
                blockingQueue.add(new Goods("品牌B", "产品B"));
            }
        }
    }

}
