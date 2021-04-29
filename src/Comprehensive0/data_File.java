package Comprehensive0;

/**
 * @Author: sun
 * @Date: 2021/4/29 09:30
 * @title: data_File
 * @Description:
 * @version: 1.0
 */
public class data_File implements dataGet{

    private dataShow dataShow;

    @Override
    public void setGetDataWay(dataShow name) {
        this.dataShow = name;
    }

    @Override
    public void datashow(String name) {
        System.out.println("通过文件获取:"+name);
    }


}
