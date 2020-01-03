package ReflectionDemo.classes;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class retrievingClassObjects {

    enum e {A, B}

    public static void main(String[] args) {
        System.out.println("#############################################################");
        /**
         * Object.getClass()
         */

        // java.lang.String Class
        Class c = "foo".getClass();
        System.out.println(c);

//        Class aClass = System.console().getClass();
//        System.out.println(aClass);

        // E enum
        Class eClass = e.A.getClass();
        System.out.println(eClass);

        // byte arrays
        byte[] bytes = new byte[1024];
        Class bytesClass = bytes.getClass();
        System.out.println(bytesClass);

        // java.util.HashSet  interface
        Set<String> s = new HashSet<>();
        Class sClass = s.getClass();
        System.out.println(sClass);

        System.out.println("#############################################################");

        /**
         * .class syntax
         */

        Class<Boolean> booleanClass = boolean.class;
        System.out.println(booleanClass);

        Class<PrintStream> printStreamClass = PrintStream.class;
        System.out.println(printStreamClass);

        Class<int[][][]> arrayClass = int[][][].class;
        System.out.println(arrayClass);

        System.out.println("#############################################################");

        /**
         * TYPE Field for Primitive Type Wrappers
         */

        Class<Double> dType = Double.TYPE;
        System.out.println(Double.TYPE==double.class);

        Class<Void> vType = Void.TYPE;
        System.out.println(Void.TYPE==void.class);

        System.out.println("#############################################################");

        /**
         * Methods that Return Classes
         */

        System.out.println(C.class.getSuperclass());

        for(Class<?> clazz: Character.class.getClasses()){
            System.out.println("Character :" + clazz + clazz.getDeclaringClass());
        }

        System.out.println("#############################################################");

        for(Class<?> clazz: Character.class.getDeclaredClasses()){
            System.out.println("Character :" + clazz + clazz.getDeclaringClass());
        }

        System.out.println(Thread.State.class.getEnclosingClass());
    }
}

class A {

}

class B extends A {

}

class C extends B implements X{

}

interface X {

}
