/*
练习一：
实现一个带有传输功能的USB接口


练习二：
实现防盗门类，打印以下字符

轻轻拉门，门关上了
插入钥匙，锁住
插入钥匙，解锁
用力推，门开了

练习三：
扩展防盗门门铃功能，主要是实现拍照存储

轻轻拉门，门关上了
插入钥匙，锁住
拍照，已存储
插入钥匙，解锁
用力推，门开了

练习四：

原始的手机，可以发短信、打电话。
随着发展，手机增加了功能：音频、视频播放、拍照、上网


练习五：

采用面向接口编程思想组装一台计算机
计算机的主要组成部分有：
- CPU
- 内存
- 硬盘

显示如下结果：
计算机信息如下：
CPU品牌是：Intel ,主频是：33
硬盘容量是：512
内存容量是：4

 */

package src.oop.com.interface_demo;

public class Test {
    public static void main(String[] args){
      Computer c = new Computer();
      c.count();
      c.permanentStorage();
      c.tmpStorage();
      c.info();

    }
}
