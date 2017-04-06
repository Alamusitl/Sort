package com.owl;

/**
 * 插入排序
 * Created by Alamusi on 2017/4/6.
 */

public class InsertSort extends BaseSort {

    public static void main(String[] argv) {
        insertSort(getArray());
    }

    private static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        print();
    }
}
