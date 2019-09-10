/*
练习一：
实现一个带有传输功能的USB接口


练习二：
实现防盗门类，打印以下字符

轻轻拉门，门关上了
插入钥匙，锁住
插入钥匙，解锁
用力推，门开了


 */

package src.oop.com.interface_demo;

public class Test {
    public static void main(String[] args){
        Lock lock = new SecurityDoor();
        Door door = new SecurityDoor();
        door.close();
        lock.Lock();
        lock.UnLock();
        door.open();

    }
}
