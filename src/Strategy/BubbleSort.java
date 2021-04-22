package Strategy;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Strategy
 * @ClassName: BubbleSort
 * @author: sun
 * @Description: 冒泡
 * @Date: 2021/4/22 14:42
 * @Version: 1.0
 */
public class BubbleSort implements SorterStrategy{
    @Override
    public void sort() {
        System.out.println("选择冒泡");
    }

}
