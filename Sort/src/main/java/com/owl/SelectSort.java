package com.owl;

/**
 * 选择排序法
 * Created by Alamusi on 2017/4/6.
 */

public class SelectSort extends BaseSort {

    public static void main(String[] argv) {
        selectionSort(getArray());
        print();
    }

    private static void selectionSort(int[] a) {
        // i = 0时选出最小的数与数组第一个数交换
        // i = 1时选出第二个小的数与数组第二个数交换
        // 如此循环
        // 时间复杂度为O(n^2)
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
