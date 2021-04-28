package Adapter;

/**
 * @author sun
 * @title: main
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/297:51
 */
public class main {
    public static void main(String[] args) {
        Cube cube=new Cube(3.0);
        MagucFinger finger=new MagucFinger(cube);

        System.out.println("Area:"+finger.calculaterArea());
        System.out.println("Volume:"+finger.calculateVolume());
    }
}
