package Adapter;

/**
 * @author sun
 * @title: MagucFinger
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/297:48
 */
public class MagucFinger implements Ballif{

    private double radius=0;
    private static double PI=3.14;
    private  Cube adaptee;

    MagucFinger(Cube adaptee){
        super();
        this.adaptee=adaptee;
        radius=this.adaptee.getWidth();

    }

    @Override
    public Double calculaterArea() {
        return PI*radius*radius;
    }

    @Override
    public Double calculateVolume() {
        return (4.0/3.0)*PI*(radius*radius);
    }
}
