package Comprehensive0;

/**
 * @Author: sun
 * @Date: 2021/4/29 09:47
 * @title: data_Database
 * @Description:
 * @version: 1.0
 */
public class data_Database implements dataGet{
    private dataShow dataShow;

    @Override
    public void setGetDataWay(dataShow name) {
        this.dataShow = name;
    }

    @Override
    public void datashow(String name) {
        System.out.println("通过数据库获取:"+name);
    }
}
