package Comprehensive1;

/**
 * @Author: sun
 * @Date: 2021/4/29 10:54
 * @title: Decorator
 * @Description:
 * @version: 1.0
 */
public abstract class Decorator extends Comprehensive1.chou {
    chou chou;
    public Decorator(chou chou){
        this.chou=chou;
    }

}
