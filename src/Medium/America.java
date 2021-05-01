package Medium;

import java.util.ArrayList;

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
    public ArrayList<UnitedNations> arrayList=new ArrayList<>();

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
        this.arrayList.add(unitedNations);
    }

    @Override
    public void declare(String message,String Un, String countryname) {
        System.out.println(this.name+"通过"+Un+"传递"+message+"给"+countryname);
        for(UnitedNations guo:arrayList){
            if(guo.getName().equals(Un)){
                guo.declare(message,countryname);
                break;
            }
        }
    }


    @Override
    public void getMessage(String message) {
        System.out.println(name+"收到"+message);
    }
}
