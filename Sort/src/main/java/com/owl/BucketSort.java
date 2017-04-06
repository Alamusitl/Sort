package com.owl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 桶排序法，时间复杂度可以达到O(N)
 * Created by Alamusi on 2017/4/6.
 */

public class BucketSort extends BaseSort {

    public static void main(String[] argv) {
        int[] arr = getArray();
        int bucketNum = 10;// 桶数量

        List<List<Integer>> buckets = new ArrayList<>();

        for (int i = 0; i < bucketNum; i++) {
            buckets.add(new LinkedList<>());// 用链表比较合适
        }

        // 划分桶
        for (int i = 0; i < length(); i++) {
            buckets.get(f(arr[i])).add(arr[i]);
        }

        // 对每个桶进行排序
        for (int i = 0; i < buckets.size(); i++) {
            if (!buckets.get(i).isEmpty()) {
                Collections.sort(buckets.get(i));// 对每个桶进行快排
            }
        }

        // 还原排好序的数组
        int k = 0;
        for (List<Integer> bucket : buckets) {
            for (int ele : bucket) {
                arr[k++] = ele;
            }
        }

        print();
    }

    /**
     * 映射函数
     *
     * @param x
     * @return
     */
    private static int f(int x) {
        return x;
    }
}
