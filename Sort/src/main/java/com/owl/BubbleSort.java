package com.owl;

/**
 * 冒泡排序法
 * Created by Alamusi on 2017/4/6.
 */

public class BubbleSort extends BaseSort {

    public static void main(String[] argv) {
        bubbleSort(getArray());
    }

    private static void bubbleSort(int[] a) {
        int n = a.length;
        // i = 0时把最大的数排到最后面
        // i = 1时把第二个大的数排到最大数前面
        // 如此循环排序
        // 时间复杂度的O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.println("i = " + i + ", j = " + j + ", " + a[j - 1] + " :" + a[j]);
                if (a[j - 1] > a[j]) {//交换
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        print();
    }
}
