package src.ThreadDemo.pc3;

public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);
        Thread producerThread = new Thread(producer);
        Thread consumenrThread = new Thread(consumer);
        producerThread.start();
        consumenrThread.start();
    }
}
