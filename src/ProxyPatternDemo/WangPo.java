package src.ProxyPatternDemo;

public class WangPo implements KindWomen {
    private KindWomen kindWomen;

    public WangPo(){
        this.kindWomen = new PanjinLian();
    }

    public WangPo(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan(){
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan(){
        this.kindWomen.happyWithMan();
    }
}
