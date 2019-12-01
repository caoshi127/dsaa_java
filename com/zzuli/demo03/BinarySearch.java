package com.zzuli.demo03;

/**
 * 二分法查找 方法封装
 *
 * @author CaoShi
 * @time 2019/10/19 17:50
 */
public class BinarySearch {

    /**
     *  不使用递归实现
     * @param arr 指定排序数组
     * @param target  待查找的目标元素
     * @return 查找成功返回值目标元素的索引值 否则返回-1
     */
    private static int search(int[] arr, int target) {
        int begin = 0, end = arr.length - 1, mid = (begin + end) / 2;
        while (true) {
            if (begin > end) {
                return -1;
            }
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                begin = mid + 1;
            }
            mid = (begin + end) / 2;
        }
    }

    /**
     *  使用递归实现
     * @param arr       指定排序数组
     * @param target    待查找的目标元素
     * @param begin     数组的起始下标
     * @param end       数组的结尾下标
     * @return          查找成功返回值目标元素的索引值 否则返回-1
     */
    private static int search(int[] arr, int target, int begin, int end) {
        int mid = (begin + end) / 2;
        if (begin > end) {
            return -1;
        }
        if (target == arr[mid]) {
            return mid;
        }
        else if (target > arr[mid]) {
            return search(arr, target, mid + 1, end);
        }
        else {
            return search(arr, target, begin, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 4, 5, 7, 8, 9, 10};
        int target = 3;

        int index = search(arr, target);
        //int index2 = search(arr, 5, 0, arr.length - 1);
        System.out.println("index:" + index);
    }
}
