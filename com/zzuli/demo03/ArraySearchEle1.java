package com.zzuli.demo03;

/**
 * 线性查找数组元素
 *
 * @author CaoShi
 * @time 2019/10/19 16:55
 */
public class ArraySearchEle1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 6, 1, 7, 9, 10};
        int target = 3;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("index: " + index);
    }
}
