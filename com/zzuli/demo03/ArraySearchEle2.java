package com.zzuli.demo03;

/**
 * 二分法查找数组元素
 * 要求查找的目标数组必须是有序的
 *
 * @author CaoShi
 * @time 2019/10/19 16:59
 */
public class ArraySearchEle2 {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 4, 5, 7, 8, 9, 10};
        int target = 7;
        int index = -1;
        int low = 0, high = arr.length - 1, mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            }
            if (arr[mid] > target) {
                high = mid - 1;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            }
        }
        System.out.println("index: " + index);
    }
}
