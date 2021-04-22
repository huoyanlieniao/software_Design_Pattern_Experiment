package Strategy;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Strategy
 * @ClassName: MergeSort
 * @author: sun
 * @Description: 归并
 * @Date: 2021/4/22 14:44
 * @Version: 1.0
 */
public class MergeSort implements SorterStrategy {

    @Override
    public void sort() {
        System.out.println("选择归并");
    }
}
