package src.ThreadDemo.pc2;

public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);
        Thread producerThread = new Thread(producer);
        Thread consumenrThread = new Thread(consumer);
        producerThread.start();
        consumenrThread.start();
        /**
         * 问题：
         *
         * 解决生产的商品和产品不一致问题
         */
    }
}
