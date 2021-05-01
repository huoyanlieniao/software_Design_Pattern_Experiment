package Strategy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Strategy
 * @ClassName: main
 * @author: sun
 * @Description: 执行
 * @Date: 2021/4/22 14:50
 * @Version: 1.0
 */
public class main{
  public static void main(String[] args){
      //创建上下文
      SortSystem sortSystem=new SortSystem();
      sortSystem.setSorterStrategy(new HeapSort());
      ArrayList<Integer> arrayList=new ArrayList<Integer>(Arrays.asList(1,5,7,8,9,54,6,2,4,8));

      sortSystem.get(arrayList);
  }


}
