package src.ProxyPatternDemo;

public class XiMenQing {
    public static void main(String[] args) {
        WangPo wangPo0 = new WangPo();
        wangPo0.makeEyesWithMan();
        wangPo0.happyWithMan();

        WangPo wangPo = new WangPo(new JiaShi());
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();
    }
}
