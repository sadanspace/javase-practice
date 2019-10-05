package src.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2.0);
        collection.add("3");
        System.out.println(collection);

        Collection collection1 = new ArrayList();
        collection1.add("a");
        collection1.add("b");
        collection1.add("c");
        collection.addAll(collection1);
        System.out.println(collection);

//        collection.clear();
//        System.out.println(collection);
        System.out.println(collection.contains("a"));
        System.out.println(collection.containsAll(collection1));
        System.out.println(collection.equals(collection1));
        System.out.println(collection.hashCode());
        System.out.println(collection.isEmpty());
        System.out.println(collection.iterator());
        System.out.println(collection.parallelStream());
        // delete one element
        collection.remove(1);
        System.out.println(collection);
        // delete collection1 elements
        collection.removeAll(collection1);
        System.out.println(collection);
//        collection.removeIf();
        Collection collection2 = new ArrayList();
        collection2.add("3");
        collection.retainAll(collection2);
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.spliterator());
        System.out.println(collection.stream());

        System.out.println(collection.toArray());




    }
}
