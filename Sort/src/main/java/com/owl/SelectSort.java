package com.owl;

/**
 * Created by Alamusi on 2017/4/6.
 */

public class SelectSort extends BaseSort {

    public static void main(String[] argv) {
        selectionSort(Constant.sArray);
        print();
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {//做第i趟排序
            int minIndex = i;
            for (int j = minIndex + 1; j < a.length; j++) {//选最小的记录
                if (a[j] < a[minIndex]) {
                    minIndex = j; //记下目前找到的最小值所在的位置
                }
            }
            if (i != minIndex) {  //交换a[i]和a[k]
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
}
