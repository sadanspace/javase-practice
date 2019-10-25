package src.ThreadDemo.pc1;

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
         * 1. 生产之前就消费，生产和消费不是先后关系
         * 2. 生产的品牌和产品有不对应的
         */
    }
}
