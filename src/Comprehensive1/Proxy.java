package Comprehensive1;

/**
 * @Author: sun
 * @Date: 2021/4/29 10:34
 * @title: Proxy
 * @Description:
 * @version: 1.0
 */
public class Proxy implements Employee{

    Star star;

    Proxy(){
        this.star=new Star();
    }

    @Override
    public String Show(String s) {
        if(!(s.equals("恐吓"))){
            String w=star.Show(s);
            return w;
        }else{
            return "不接电话";
        }
    }
}
