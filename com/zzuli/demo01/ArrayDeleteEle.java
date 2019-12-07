package com.zzuli.demo01;

import java.util.Arrays;

/**
 * 数组元素的删除
 * 遍历新数组, 跳过要删除元素下标对应的元素.
 *
 * @author CaoShi
 * @time 2019/10/19 16:50
 */
public class ArrayDeleteEle {
    public static void main(String[] args) {
        // 原始数组
        int[] arr = new int[]{1, 2, 3, 4, 3, 2, 5, 6, 9, 2};
        System.out.println("删除元素前: " + Arrays.toString(arr));
        // 新数组
        int[] newArr = new int[arr.length - 1];

        // 要删除元素的索引
        int del = 9;

        // 遍历新数组
        for (int i = 0; i < newArr.length; i++) {
            if (i < del) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }

        arr = newArr;
        System.out.println("删除元素后: " + Arrays.toString(arr));
    }
}
