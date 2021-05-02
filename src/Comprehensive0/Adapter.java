package Comprehensive0;

/**
 * @Author: sun
 * @Date: 2021/4/29 10:04
 * @title: Adapter
 * @Description:
 * @version: 1.0
 */
public class Adapter {
    ExecelApi execelApi=new ExecelApi();
    public void trans(){
        execelApi.getData();
        System.out.println("api数据转化");
    }

}
