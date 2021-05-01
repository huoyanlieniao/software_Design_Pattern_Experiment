package Strategy;

import java.util.ArrayList;

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
    public void sort(ArrayList<Integer> arrayList) {
        for(int i=0;i<arrayList.size()-1;i++)
        {
            for(int j=0;j<arrayList.size()-1-i;j++)
            {
                if(arrayList.get(j)>arrayList.get(j+1))
                {
                    int temp=arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                }
            }
        }
        System.out.println("冒泡算法从小到大排序后的结果是:");
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

    }

}


