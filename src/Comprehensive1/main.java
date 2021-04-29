package Comprehensive1;

/**
 * @Author: sun
 * @Date: 2021/4/29 10:37
 * @title: main
 * @Description:
 * @version: 1.0
 */
public class main {
    public static void main(String[] args) {
        Proxy proxy=new Proxy();
        String sh="活动";
        System.out.println(sh);
        sh=proxy.Show(sh);
        System.out.println(sh);
        if(sh.equals("出演")){
            chou chou=new substitute();
            System.out.println(chou.show());
            ConcreteDecotator chou1 = new ConcreteDecotator(chou);
            chou1.show();

        }
        sh="恐吓";
        System.out.println(sh);
        sh=proxy.Show(sh);
        System.out.println(sh);



    }
}
