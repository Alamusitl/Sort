package com.owl;

/**
 * 希尔排序法
 * 时间复杂度可以达到O(n^1.3)
 * Created by Alamusi on 2017/4/6.
 */

public class ShellSort extends BaseSort {

    public static void main(String[] argv) {
        int d = length() / 2;
        while (d >= 1) {
            shellSort(getArray(), d);
            d /= 2;
        }
        print();
    }

    private static void shellSort(int[] arr, int d) {
        for (int i = d; i < arr.length; i++) {
            int j = i - d;
            int temp = arr[i];// 记录要插入的数据
            while (j >= 0 && arr[j] > temp) {
                arr[j + d] = arr[j];
                j -= d;
            }
            if (j != i - d) {
                arr[j + d] = temp;
            }
        }
    }
}
