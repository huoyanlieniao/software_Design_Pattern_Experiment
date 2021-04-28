package Adapter;

/**
 * @author sun
 * @title: Cube
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/297:45
 */
public class Cube {

    private double width;

    Cube(double width){

        this.width=width;

    }

    public double calculateColume(){
        return width*width*width;
    }

    public double calculaFaceArea(){
        return width*width*6;

    }

    public double getWidth(){
        return this.width;
    }

}
