package com.zzuli.demo02;

import java.util.Arrays;

/**
 *
 * 自定义可变数组
 * @author CaoShi
 * @time 2019/10/9 10:38
 */
public class MyArray {

    // 底层数组
    private int[] elements;

    // 构造器, 初始化底层数组
    public MyArray() {
        this.elements = new int[0];
    }

    // 获取数组长度
    public int size() {
        return this.elements.length;
    }

    // 打印数组元素
    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    // 在数组末尾添加元素
    public void add(int element) {
        // 新数组
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        // 新数组替换旧数组
        elements = newArr;
    }

    // 删除指定位置的元素
    public void delete(int index) {

        // 判断下标是否合法
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界!");
        }

        // 新数组
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i] = elements[i + 1];
            }
        }
        // 新数组替换旧数组
        elements = newArr;
    }

    // 获取指定位置的元素
    public int get(int index) {
        // 判断下标是否合法
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界!");
        }
        return this.elements[index];
    }

    // 替换指定位置的元素
    public void set(int index, int element) {
        // 判断下标是否合法
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界!");
        }
        elements[index] = element;
    }

    // 在指定位置插入指定元素
    public void insert(int index, int element) {
        // 判断下标是否合法
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界!");
        }
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            // index 之前的元素不动
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                // index 之后(不包括index位置)元素往后移一位
                newArr[i + 1] = elements[i];
            }
        }
        // 插入指定元素
        newArr[index] = element;
        // 新数组替换旧数组
        elements = newArr;
    }

}
