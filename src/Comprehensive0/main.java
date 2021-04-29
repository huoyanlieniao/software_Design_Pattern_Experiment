package Comprehensive0;

/**
 * @Author: sun
 * @Date: 2021/4/29 09:48
 * @title: main
 * @Description:
 * @version: 1.0
 */
public class main {
    public static void main(String[] args) {
        dataGet dataGet=new data_File();
        dataShow dataShow=new dataShow1();

        dataShow.setDataGet(dataGet);
        dataShow.dataShow("saaa");
        dataGet.datashow("aaa");

    }
}
