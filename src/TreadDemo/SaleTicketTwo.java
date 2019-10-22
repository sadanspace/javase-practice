package src.TreadDemo;

import java.util.ArrayList;
import java.util.List;

public class SaleTicketTwo implements Runnable {
    private int tickets = 5;

    @Override
    public void run(){
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + " number: " + (tickets--));
            } else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        List<Thread> list = new ArrayList();
        SaleTicketTwo saleTicketTwo = new SaleTicketTwo();
        list.add(new Thread(saleTicketTwo));
        list.add(new Thread(saleTicketTwo));
        list.add(new Thread(saleTicketTwo));
        list.add(new Thread(saleTicketTwo));
        list.add(new Thread(saleTicketTwo));

        for(Thread thread:list){
            thread.start();
        }
    }
}
