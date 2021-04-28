package Medium;

/**
 * @author sun
 * @title: China
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/2818:24
 */
public class China implements Country{

    public String name="";
    public UnitedNations unitedNations;

    China(){
        this.name="China";
    }
    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setUn(UnitedNations un) {
         this.unitedNations=  un;
         this.unitedNations.addCountry(this);
    }

    @Override
    public void declare(String message,String countryname) {
        System.out.println(this.name+"传递"+message);
        unitedNations.declare(message,countryname);
    }


    @Override
    public void getMessage(String message) {
        System.out.println(name+"收到"+message);

    }
}
