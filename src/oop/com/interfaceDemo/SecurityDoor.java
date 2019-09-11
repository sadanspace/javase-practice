package src.oop.com.interface_demo;

public class SecurityDoor extends Door implements Lock, DoorBell {
    @Override
    public void Lock(){
        System.out.println("插入钥匙，锁住");
    }

    @Override
    public void UnLock(){
        System.out.println("插入钥匙，解锁");
    }

    @Override
    public void photograph(){
        System.out.println("拍照，已存储");
    }


}
