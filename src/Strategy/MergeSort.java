package Strategy;

import java.util.ArrayList;

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
    public void sort(ArrayList<Integer> arrayList) {
       ArrayList<Integer>arrayList1 = sort(arrayList,0,arrayList.size()-1);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList1.get(i));
        }
    }

    public ArrayList<Integer> sort(ArrayList<Integer> arrayList,int low,int hight){
        int mid = (low+hight)/2;
        if(low<hight){
            sort(arrayList,low,mid);
            sort(arrayList,mid+1,hight);
            //左右归并
            merge(arrayList,low,mid,hight);
        }
        return arrayList;

    }

    public static void merge(ArrayList<Integer> a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i= low;
        int j = mid+1;
        int k=0;
        // 把较小的数先移到新数组中
        while(i<=mid && j<=high){
            if(a.get(i)<a.get(j)){
                temp[k++] = a.get(i++);
            }else{
                temp[k++] = a.get(j++);
            }
        }
        // 把左边剩余的数移入数组
        while(i<=mid){
            temp[k++] = a.get(i++);
        }
        // 把右边边剩余的数移入数组
        while(j<=high){
            temp[k++] = a.get(j++);
        }
        // 把新数组中的数覆盖nums数组
        for(int x=0;x<temp.length;x++){
            a.set(x+low,temp[x]);
        }
    }
}
