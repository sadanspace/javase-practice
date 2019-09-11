package src.oop.com.interface_demo;

public class IntelligentPhone extends Phone implements Audio,ConnNetwork,Photograph, Video {
    @Override
    public void play(){
        System.out.println("播放音频");
    }

    @Override
    public void conn(){
        System.out.println("上网");
    }

    @Override
    public void take(){
        System.out.println("拍照");
    }

    // 同一个类中，不能重写相同的成员方法
    @Override
    public void play(String s){
        System.out.println("播放音频");
    }


    @Override
    void call(){
        System.out.println("智能手机打电话");
    }
}
