package Medium;

import java.util.ArrayList;

/**
 * @author sun
 * @title: WTO
 * @projectName software_Design_Pattern_Experiment
 * @description: TODO
 * @version: 1.0
 * @date 2021/4/2818:25
 */
public class WTO implements UnitedNations{

    ArrayList<Country> arrayList;
    String name;

    WTO(){
        this.arrayList=new ArrayList<>();
        this.name="WTO";
    }


    @Override
    public void declare(String message, String country) {
        Country country1;
        for (int i = 0; i <arrayList.size() ; i++) {
            country1=arrayList.get(i);
            if(country1.getName().equals(country)) {
                country1.getMessage(message);
            }
        }
    }

    @Override
    public void addCountry(Country country) {
        if(!arrayList.contains(country)){
            arrayList.add(country);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
