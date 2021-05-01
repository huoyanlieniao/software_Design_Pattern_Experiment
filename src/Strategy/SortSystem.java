package Strategy;

import java.util.ArrayList;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Strategy
 * @ClassName: SortSystem
 * @author: sun
 * @Description: 客户端
 * @Date: 2021/4/22 14:46
 * @Version: 1.0
 */
public class SortSystem {
    SorterStrategy sorterStrategy;
    public void setSorterStrategy(SorterStrategy sorterStrategy){
        this.sorterStrategy=sorterStrategy;
    }
    public void get(ArrayList<Integer> arrayList){
        sorterStrategy.sort(arrayList);
    }

}
