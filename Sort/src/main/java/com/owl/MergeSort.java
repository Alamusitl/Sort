package com.owl;

/**
 * Created by Alamusi on 2017/4/6.
 */

public class MergeSort extends BaseSort {

    public static void main(String[] argv) {
        sort(getArray(), 0, length() - 1);
        print();
    }

    /**
     * 递归分治
     *
     * @param arr   待排数组
     * @param left  左指针
     * @param right 右指针
     */
    private static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;

        sort(arr, left, mid);// 递归排序左边
        sort(arr, mid + 1, right);// 递归排序右边
        merge(arr, left, mid, right);// 合并
    }

    /**
     * 合并两个有序数组
     *
     * @param arr   待合并数组
     * @param left  左指针
     * @param mid   中间指针
     * @param right 右指针
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];// 中间数组

        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }
}
