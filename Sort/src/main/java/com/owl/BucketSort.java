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

    /**
     * 桶排序分析：
     * <p>
     * 桶排序利用函数的映射关系，减少了几乎所有的比较工作。实际上，桶排序的f(k)值的计算，其作用就相当于快排中划分，希尔排序中的子序列，归并排序中的子问题，已经把大量数据分割成了基本有序的数据块(桶)。然后只需要对桶中的少量数据做先进的比较排序即可。
     * <p>
     * 对N个关键字进行桶排序的时间复杂度分为两个部分：
     * <p>
     * (1) 循环计算每个关键字的桶映射函数，这个时间复杂度是O(N)。
     * <p>
     * (2) 利用先进的比较排序算法对每个桶内的所有数据进行排序，其时间复杂度为  ∑ O(Ni*logNi) 。其中Ni 为第i个桶的数据量。
     * <p>
     * 很显然，第(2)部分是桶排序性能好坏的决定因素。尽量减少桶内数据的数量是提高效率的唯一办法(因为基于比较排序的最好平均时间复杂度只能达到O(N*logN)了)。因此，我们需要尽量做到下面两点：
     * <p>
     * (1) 映射函数f(k)能够将N个数据平均的分配到M个桶中，这样每个桶就有[N/M]个数据量。
     * <p>
     * (2) 尽量的增大桶的数量。极限情况下每个桶只能得到一个数据，这样就完全避开了桶内数据的“比较”排序操作。当然，做到这一点很不容易，数据量巨大的情况下，f(k)函数会使得桶集合的数量巨大，空间浪费严重。这就是一个时间代价和空间代价的权衡问题了。
     * <p>
     * 对于N个待排数据，M个桶，平均每个桶[N/M]个数据的桶排序平均时间复杂度为：
     * <p>
     * O(N)+O(M*(N/M)*log(N/M))=O(N+N*(logN-logM))=O(N+N*logN-N*logM)
     * <p>
     * 当N=M时，即极限情况下每个桶只有一个数据时。桶排序的最好效率能够达到O(N)。
     * <p>
     * 总结： 桶排序的平均时间复杂度为线性的O(N+C)，其中C=N*(logN-logM)。如果相对于同样的N，桶数量M越大，其效率越高，最好的时间复杂度达到O(N)。 当然桶排序的空间复杂度 为O(N+M)，如果输入数据非常庞大，而桶的数量也非常多，则空间代价无疑是昂贵的。此外，桶排序是稳定的。
     */

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
