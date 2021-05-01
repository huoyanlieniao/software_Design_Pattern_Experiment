package Strategy;

import java.util.ArrayList;

/**
 * @ProjectName: software_Design_Pattern_Experiment
 * @Package: Strategy
 * @ClassName: QuickSort
 * @author: sun
 * @Description: 快排 引用 https://www.cnblogs.com/captainad/p/10999697.html
 * @Date: 2021/4/22 14:43
 * @Version: 1.0
 */
public class QuickSort implements SorterStrategy {


    @Override
    public void sort(ArrayList<Integer> arrayList) {
        int len;
        if(arrayList == null || (len =arrayList.size()) == 0 || len == 1) {
            return ;
        }

        zhi(arrayList, 0, len - 1);

    }

    public static void zhi(ArrayList<Integer> array, int left, int right) {
            if(left > right) {
                    return;
                }
           // base中存放基准数
           int base = array.get(left);
           int i = left, j = right;
           while(i != j) {
                     // 顺序很重要，先从右边开始往左找，直到找到比base值小的数
                  while(array.get(j) >= base && i < j) {
                            j--;
                        }

                   // 再从左往右边找，直到找到比base值大的数
                    while(array.get(j) <= base && i < j) {
                           i++;
                       }

                   // 上面的循环结束表示找到了位置或者(i>=j)了，交换两个数在数组中的位置
                   if(i < j) {
                           int tmp = array.get(i);
                           array.set(i,array.get(j)) ;
                           array.set(j,tmp);
                        }
              }

           // 将基准数放到中间的位置（基准数归位）
           array.set(left,array.get(i));
           array.set(i,base);

          // 递归，继续向基准的左右两边执行和上面同样的操作
           // i的索引处为上面已确定好的基准值的位置，无需再处理
           zhi(array, left, i - 1);
           zhi(array, i + 1, right);
         }


}
