package Comprehensive1;

/**
 * @Author: sun
 * @Date: 2021/4/29 10:55
 * @title: ConcreteDecotator
 * @Description:
 * @version: 1.0
 */
public class ConcreteDecotator extends Decorator{

  ConcreteDecotator(chou chou){
      super(chou);
  }

    public void show(){
        String s=chou.show()+xiu();
        System.out.println(s);
    }

    public String xiu(){
        return "打扮后，像了";
    }
}
