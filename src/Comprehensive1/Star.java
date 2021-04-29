package Comprehensive1;

/**
 * @Author: sun
 * @Date: 2021/4/29 10:29
 * @title: Star
 * @Description:
 * @version: 1.0
 */
public class Star implements Employee{
    @Override
    public String Show(String s) {
        if(s.equals("活动")){
            return "出演";
        }else {
            return "以后再联系";
        }
    }
}
