package Comprehensive0;

/**
 * @Author: sun
 * @Date: 2021/4/29 09:48
 * @title: dataEcel
 * @Description:
 * @version: 1.0
 */
public class dataExecel implements dataGet{
    private dataShow dataShow;
    Adapter adapter=new Adapter();

    @Override
    public void setGetDataWay(dataShow name) {
        this.dataShow = name;
    }

    @Override
    public void datashow(String name) {
        adapter.trans();
        System.out.println("通过Excel获取:"+name);
    }

}
