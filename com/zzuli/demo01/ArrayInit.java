package com.zzuli.demo01;

import java.util.Arrays;

/**
 * 数组的基本操作
 * 声明数组并初始化数组时不可指定数组长度(方括号里不可写数字)
 * int[] arr = new int[] {1, 2, 3, 4};  √
 * int[] arr = new int[4] {1, 2, 3, 4}; ×
 *
 * @author CaoShi
 * @time 2019/10/9 9:28
 */
public class ArrayInit {
    public static void main(String[] args) {
        // 创建数组
        int[] arr1 = new int[3];
        // 获取数组长度
        int len1 = arr1.length;
        System.out.println(len1);

        // 访问数组元素
        int ele1 = arr1[0];
        System.out.println(ele1);

        // 为数组元素赋值
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        // 利用util工具类方法打印数组的所有元素
        System.out.println(Arrays.toString(arr1));

        System.out.println("----------------------");

        // 遍历数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // 创建数组的同时初始化数组, 方括号里不可以声明数组长度!!!
        int[] arr2 = new int[]{1, 2, 3, 4};
        // 不推荐的简化方式
        // int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(arr2.length);
        // System.out.println(arr3.length);

    }
}
