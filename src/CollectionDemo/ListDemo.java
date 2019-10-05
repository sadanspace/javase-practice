package src.CollectionDemo;

import java.util.ArrayList;
import java.util.List;


public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(0, 2);
        list.add(1);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));
        list.set(1, 1000);
        System.out.println(list);
        List subList = list.subList(1, 3);
        System.out.println(subList);
    }
}
