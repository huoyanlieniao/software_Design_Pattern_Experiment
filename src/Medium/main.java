package Medium;

/**
 * @author sun
 * @title: main
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/2819:03
 */
public class main {
    public static void main(String[] args) {
        UnitedNations unitedNations=new WTO();
        Country china=new China();
        Country ameirca=new America();
        china.setUn(unitedNations);
        ameirca.setUn(unitedNations);

        china.declare("你好","WTO",ameirca.getName());
        ameirca.declare("hello","WTO",china.getName());


    }


}
