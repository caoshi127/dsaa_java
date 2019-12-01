package com.zzuli.demo05;

/**
 * 队列底层实现
 *
 * @author CaoShi
 * @time 2019/10/20 15:28
 */
public class MyQueue {
    private int[] elements;

    public MyQueue() {
        this.elements = new int[0];
    }

    // 元素入队
    public void add(int element) {
        int[] newArr = new int[elements.length + 1];
        newArr[elements.length] = element;
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
    }

    // 元素出队
    public int poll() {
        if (this.isEmpty()) {
            throw new RuntimeException("The queue is empty!");
        }
        // 取出队首元素
        int head = elements[0];
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i + 1];
        }
        elements = newArr;
        return head;
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }

    // 打印队列所有元素


}
