package Observed;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * @author sun
 * @title: specificStock
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/2613:57
 */
public class specificStock implements stock{

    //数据
    String stock;
    ArrayList<owner> arrayList;
    ArrayList<Integer> price;


/**
 * @Author sun
 * @Description 初始化具体股票
 * @Date 14:05 2021/4/26
 * @Param []
 * @return
**/
    specificStock(String s) {
        arrayList=new ArrayList<owner>();
        stock=s;
        price=new ArrayList<>();

    }

    @Override
    public void addOwner(owner o) {
        if (!arrayList.contains(o)) {
            arrayList.add(o);
        }

    }

    @Override
    public void delOwner(owner o) {
         if(arrayList.contains(o)){
             arrayList.remove(o);
         }

    }

    @Override
    public void noticeOwner() {
        if(isChanged()){
            for (owner owner : arrayList) {
                owner.hearDate(stock);
            }
        }

    }

    public void setPrice(int a){
        price.add(a);
    }


    /**
     * @Author sun
     * @Description //判断价格波动是否需要通知
     * @Date 14:14 2021/4/26
     * @Param []
     * @return boolean
    **/
    public boolean isChanged(){
        if(price.size()<2){
            //价格数据小于两个的时候，波动不变
           return false;
        }else {
            int a=price.get(price.size()-1);
            int b=price.get(price.size()-2);
            if(b==0){
                System.out.println("价格上涨"+a);
                return true;
                } else{
                double c=(float) (a-b) / (float) b;
                System.out.println("价格波动为"+c);
                if(c>0.05){
                    System.out.println("价格波动超过5%");
                    return true;
                }
            }


        }
        return false;

    }

}
