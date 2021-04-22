package Strategy;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Strategy
 * @ClassName: HeapSort
 * @author: sun
 * @Description: 堆排序
 * @Date: 2021/4/22 14:45
 * @Version: 1.0
 */
public class HeapSort implements SorterStrategy{

    @Override
    public void sort() {
        System.out.println("选择堆");
    }

}
