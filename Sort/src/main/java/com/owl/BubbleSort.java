package com.owl;

/**
 * Created by Alamusi on 2017/4/6.
 */

public class BubbleSort extends BaseSort {

    public static void main(String[] argv) {
        bubbleSort(Constant.sArray);
    }

    private static void bubbleSort(int[] a) {
        int n = a.length;
        //总共进行n-1轮的比较
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
