/*
练习一：
某租赁公司出租多种车辆，车型及租金情况如下：

                |轿车                                  |客车（金杯、金龙）
车型             | 别克商务(航GL8)| 宝马(550i)|别克林荫大道| <=16座 | >16座
日租费（元/每天）  | 600           | 500        |300     | 800 | 1500

实现计算租赁价格

练习二：

训练要点：
- 多态的使用
- 使用父类类型作为方法参数

需求说明：
- 在练习一基础上，实现计算多种车辆总租金的功能
- 现在有客户租用
    - 2辆宝马
    - 1辆别克商务
    - 1辆金龙（34）座
    - 租金5天共多少钱？
*/

package src.oop.com.polymorphism.carDemo;

public class Test {
    public static void main(String[] args) {
        MotoVehicle[] motos = new MotoVehicle[4];
        motos[0] = new Car("c1", "宝马", "550i");
        motos[1] = new Car("c2", "宝马", "550i");
        motos[2] = new Car("c3", "别克商务", "航GL8");
        motos[3] = new Bus("bb1", "金龙",34);
        Calc calc = new Calc();
        int sum = calc.calcTotalRent(motos, 5);
        System.out.println("总租金为：" + sum);

        }
    }
