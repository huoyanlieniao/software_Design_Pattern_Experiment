package Medium;

/**
 * @author sun
 * @title: Country
 * @projectName software_Design_Pattern_Experiment
 * @description: 国家抽象类,这里感觉用抽象类更适合，所有的国家除了名字其他方法都一样，抽象类即可
 * @version: 1.0
 * @date 2021/4/2711:17
 */
public interface Country {

    public void setName(String name);
    public String getName();
    public void setUn(UnitedNations un);
    public void declare(String message,String name);
    public void getMessage(String message);

}
