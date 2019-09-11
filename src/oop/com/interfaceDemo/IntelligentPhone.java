package src.oop.com.interface_demo;

public class IntelligentPhone extends Phone implements ConnNetwork,Photograph,PlayWiring {
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
    public void play(String content){
        if (content.equals("audio")) {
            System.out.println("播放音频");
        }else if(content.equals("video")){
            System.out.println("播放视频");
        }
    }


    @Override
    void call(){
        System.out.println("智能手机打电话");
    }
}
