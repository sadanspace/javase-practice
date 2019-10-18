package src.StreamDemo;

import java.io.Serializable;

public class Person implements Serializable {
    private String name = "person";
    private int age = 18;
    private String password = "jianchi";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

}
