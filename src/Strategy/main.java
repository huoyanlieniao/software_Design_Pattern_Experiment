package Strategy;

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
      sortSystem.setSorterStrategy(new BubbleSort());
      sortSystem.get();
  }


}
