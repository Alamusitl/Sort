package com.owl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 基数排序法
 * Created by Alamusi on 2017/4/6.
 */

public class RadixSort extends BaseSort {

    public static void main(String[] argv) {
        int maxBit = getMaxBit(getArray());

        for (int i = 1; i <= maxBit; i++) {
            List<List<Integer>> buf = distribute(getArray(), i);// 分配
            collect(getArray(), buf);
        }

        print();
    }

    /**
     * 获取最大位数
     *
     * @param array 源数组
     * @return 最大位数
     */
    private static int getMaxBit(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int ele : array) {
            int len = String.valueOf(ele).length();
            if (len > max) {
                max = len;
            }
        }
        return max;
    }

    /**
     * 分配
     *
     * @param array 待分配数组
     * @param i     要分配第几位
     * @return 分配后的数组集合
     */
    private static List<List<Integer>> distribute(int[] array, int i) {
        List<List<Integer>> buf = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            buf.add(new LinkedList<>());
        }
        for (int j = 0; j < array.length; j++) {
            buf.get(getNBit(array[j], i)).add(array[j]);
        }
        return buf;
    }

    /**
     * 获取x的第n位，如果没有则为0
     *
     * @param x
     * @param n
     * @return
     */
    private static int getNBit(int x, int n) {
        String sX = String.valueOf(x);
        if (sX.length() < n) {
            return 0;
        } else {
            return sX.charAt(sX.length() - n) - '0';
        }
    }

    /**
     * 收集
     *
     * @param array 把分配的数据收集到array中
     * @param buf
     */
    private static void collect(int[] array, List<List<Integer>> buf) {
        int k = 0;
        for (List<Integer> bucket : buf) {
            for (int ele : bucket) {
                array[k++] = ele;
            }
        }
    }
}
