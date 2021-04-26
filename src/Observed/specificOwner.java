package Observed;

/**
 * @author sun
 * @title: specificOwner
 * @projectName software_Design_Pattern_Experiment
 * @description: 具体拥有者类
 * @version: 1.0
 * @date 2021/4/2613:58
 */
public class specificOwner implements owner{
    //数据
    stock stock;
    String name;

    specificOwner(String s,stock stock){
        name=s;
        this.stock=stock;
        this.stock.addOwner(this);//将当前实例添加到引用的具体股票的拥有者

    }



    @Override
    public void hearDate(String hear) {
        System.out.println("持有的股票波动超过5%");
    }
}
