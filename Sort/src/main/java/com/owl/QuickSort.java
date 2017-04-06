package com.owl;

/**
 * 快速排序法
 * Created by Alamusi on 2017/4/6.
 */

public class QuickSort extends BaseSort {

    public static void main(String[] argv) throws Exception {
        quickSort(getArray(), 0, length() - 1);
        print();
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotPos = partition(arr, left, right);
        System.out.println("pivotPos : " + pivotPos);
        quickSort(arr, left, pivotPos - 1);
        quickSort(arr, pivotPos + 1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivotKey = arr[left];
        while (left < right) {
            while (left < right && arr[right] > pivotKey) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivotKey) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivotKey;
        return left;
    }
}
