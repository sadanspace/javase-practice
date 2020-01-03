package ReflectionDemo.classes;

import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

public class examiningClassModifiersAndTypes {

    static void showInfo(Class<?> c){
        System.out.format("Class:%n %s%n%n", c.getCanonicalName());
        System.out.format("Modifiers: %n %s%n%n", Modifier.toString(c.getModifiers()));

        System.out.format("Type Parameters:%n");
        TypeVariable[] tv = c.getTypeParameters();
        if (tv.length!=0){
            System.out.format("  ");
            for(TypeVariable t :tv){
                System.out.format("%s ", t.getName());
            }
            System.out.format("%n%n");
        } else {
            System.out.format(" -- No Type Parameters --%n%n");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz1 = Class.forName("java.util.concurrent.ConcurrentNavigableMap");
        examiningClassModifiersAndTypes.showInfo(clazz1);


    }
}
