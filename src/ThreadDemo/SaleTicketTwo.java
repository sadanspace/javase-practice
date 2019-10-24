package src.ThreadDemo;

import java.util.ArrayList;
import java.util.List;


/**
 * 存在问题：
 * 1. 票号的不是逐个递减，应该卖我第5张，才是4张
 * 2. 有时会出现多买一张票，线程不同步造成的问题
 */
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
