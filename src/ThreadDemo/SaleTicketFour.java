package src.ThreadDemo;

import java.util.ArrayList;
import java.util.List;

public class SaleTicketFour implements Runnable {
    private int tickets = 5;

    @Override
    public void run(){
        while (this.sale()) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized boolean sale(){
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + " number: " + (tickets--));
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        List<Thread> list = new ArrayList();
        SaleTicketFour saleTicketFour = new SaleTicketFour();
        list.add(new Thread(saleTicketFour));
        list.add(new Thread(saleTicketFour));
        list.add(new Thread(saleTicketFour));
        list.add(new Thread(saleTicketFour));
        list.add(new Thread(saleTicketFour));

        for(Thread thread:list){
            thread.start();
        }
    }
}
