package src.ThreadDemo;

import java.util.ArrayList;
import java.util.List;

public class SaleTicketThree implements Runnable {
    private int tickets = 5;

    @Override
    public void run(){
        while (true) {
            // 线程分配不均，只有少数线程进行卖票
            synchronized (this){
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + " number: " + (tickets--));
                } else{
                    break;
                }
            }

        }
    }

    public static void main(String[] args) {
        List<Thread> list = new ArrayList();
        SaleTicketThree saleTicketThree = new SaleTicketThree();
        list.add(new Thread(saleTicketThree));
        list.add(new Thread(saleTicketThree));
        list.add(new Thread(saleTicketThree));
        list.add(new Thread(saleTicketThree));
        list.add(new Thread(saleTicketThree));

        for(Thread thread:list){
            thread.start();
        }
    }
}
