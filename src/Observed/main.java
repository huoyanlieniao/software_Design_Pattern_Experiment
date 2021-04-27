package Observed;

/**
 * @author sun
 * @title: main
 * @projectName software_Design_Pattern_Experiment
 * @description: 应用测试类
 * @version: 1.0
 * @date 2021/4/2614:23
 */
public class main {
    public static void main(String[] args){
        //创建股票
        specificStock specificStock1=new specificStock("股票1");
        specificStock specificStock2=new specificStock("股票2");

        //创建拥有者
        specificOwner specificOwner1=new specificOwner("拥有者1",specificStock1);
        specificOwner specificOwner2=new specificOwner("拥有者2",specificStock2);


        //修改股票数据

        for (int i = 0; i <100 ; i++) {
            specificStock1.setPrice(i+i);
            specificStock1.noticeOwner();
        }

    }
}
