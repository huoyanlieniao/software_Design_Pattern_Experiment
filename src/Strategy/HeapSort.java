package Strategy;

import java.util.ArrayList;

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
    public void sort(ArrayList<Integer> arrayList) {
       heapSort(arrayList);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
    }



    /**
     * 创建堆，
     * @param arr 待排序列
     */
    private static void heapSort(ArrayList<Integer> arr) {
        //创建堆
        for (int i = (arr.size()- 1) / 2; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.size());
        }

        //调整堆结构+交换堆顶元素与末尾元素
        for (int i = arr.size() - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            int temp = arr.get(i);
            arr.set(i,arr.get(0));
            arr.set(0,temp);
            //重新对堆进行调整
            adjustHeap(arr, 0, i);
        }
    }

    /**
     * 调整堆
     * @param arr 待排序列
     * @param parent 父节点
     * @param length 待排序列尾元素索引
     */
    private static void adjustHeap(ArrayList<Integer> arr, int parent, int length) {
        //将temp作为父节点
        int temp = arr.get(parent);
        //左孩子
        int lChild = 2 * parent + 1;

        while (lChild < length) {
            //右孩子
            int rChild = lChild + 1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (rChild < length && arr.get(lChild) < arr.get(rChild)) {
                lChild++;
            }

            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= arr.get(lChild)) {
                break;
            }

            // 把孩子结点的值赋给父结点
            arr.set(parent,arr.get(lChild));

            //选取孩子结点的左孩子结点,继续向下筛选
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        arr.set(parent,temp);
    }
}
