package Medium;

/**
 * @author sun
 * @title: UnitedNations
 * @projectName software_Design_Pattern_Experiment
 * @description: 联合国抽象类
 * @version: 1.0
 * @date 2021/4/2711:17
 */
public interface UnitedNations {
   public abstract void declare(String message,String country);
   public void addCountry(Country country);


}
