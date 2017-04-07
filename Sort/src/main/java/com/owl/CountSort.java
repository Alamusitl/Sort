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

        // count 里面记录那个位置有值
        for (int i = 0; i < length(); i++) {
            count[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i <= max; i++) {// i递增，所以肯定是升序的
            for (int j = 0; j < count[i]; j++) {// 当count[i]有值的时候不等于0赋值，使用循环是因为防止重复数字的时候出错
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
