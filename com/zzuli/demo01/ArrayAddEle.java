package com.zzuli.demo01;

import java.util.Arrays;
/**
 * 添加数组元素
 * @author CaoShi
 * @time 2019/10/19 16:51
 */
public class ArrayAddEle {
    public static void main(String[] args) {
        // 原始数组
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println("插入元素前: " + Arrays.toString(arr));

        // 新数组
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // 要插入的新元素
        int add = 99;
        newArr[newArr.length - 1] = add;
        // 将新数组赋给原始数组
        arr = newArr;
        System.out.println("插入元素后: " + Arrays.toString(arr));
    }
}
