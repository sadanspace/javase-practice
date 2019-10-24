package src.ThreadDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 5张票，多个线程抢，最终票为0时，停止。保证只能抢5张。
 */
public class SaleTicketOne extends Thread {
    // 该属性值需要由多个对象共享，否则无法实现此功能
//    private int tickets = 5;
    private static int tickets = 5;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + " number: " + (tickets--));
            } else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        List<SaleTicketOne> list = new ArrayList();
        list.add(new SaleTicketOne());
        list.add(new SaleTicketOne());
        list.add(new SaleTicketOne());
        list.add(new SaleTicketOne());
        list.add(new SaleTicketOne());
        for (SaleTicketOne saleTicketOne : list) {
            saleTicketOne.start();
        }

    }
}
