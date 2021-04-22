package Strategy;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Strategy
 * @ClassName: QuickSort
 * @author: sun
 * @Description: 快排
 * @Date: 2021/4/22 14:43
 * @Version: 1.0
 */
public class QuickSort implements SorterStrategy {


    @Override
    public void sort() {
        System.out.println("选择快排");
    }
}
