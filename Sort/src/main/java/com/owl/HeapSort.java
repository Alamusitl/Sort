package com.owl;

/**
 * 堆排序
 * Created by Alamusi on 2017/4/6.
 */

public class HeapSort extends BaseSort {

    public static void main(String[] argv) {
        for (int i = length() / 2; i >= 0; i--) {
            heapAdjust(getArray(), i, length() - 1);
        }
        for (int i = length() - 1; i >= 0; i--) {
            swap(getArray(), 0, i);
            heapAdjust(getArray(), 0, i - 1);
        }
        print();
    }

    private static void heapAdjust(int[] arr, int start, int end) {
        int temp = arr[start];

        for (int i = 2 * start + 1; i <= end; i *= 2) {
            // 左右孩子的节点分别为2*i+1,2*i+2

            // 选择出左右孩子较小的下表
            if (i < end && arr[i] < arr[i + 1]) {
                i++;
            }
            if (temp >= arr[i]) {
                break;// 已经为大顶堆
            }
            arr[start] = arr[i];// 将子节点上移
            start = i;// 下一轮筛选
        }
        arr[start] = temp;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
