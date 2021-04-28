package Medium;

/**
 * @author sun
 * @title: America
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/2818:47
 */
public class America implements Country{
    public String name;
    public UnitedNations unitedNations;

    America(){
        this.name="America";
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
        this.unitedNations=un;
        this.unitedNations.addCountry(this);
    }

    @Override
    public void declare(String message, String countryname) {
        System.out.println(this.name+"传递"+message);
        unitedNations.declare(message,countryname);
    }


    @Override
    public void getMessage(String message) {
        System.out.println(name+"收到"+message);
    }
}
