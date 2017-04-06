package com.owl;

import java.util.Arrays;

/**
 * 计数排序法
 * Created by Alamusi on 2017/4/6.
 */

public class CountSort extends BaseSort {

    public static void main(String[] argv) {
        int[] arr = getArray();
        int max = max(getArray());
        int[] count = new int[max + 1];

        Arrays.fill(count, 0);

        for (int i = 0; i < length(); i++) {
            count[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }

        print();
    }

    private static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int ele : array) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

}
