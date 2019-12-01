package com.zzuli.demo04;

/**
 * 栈的底层实现
 *
 * @author CaoShi
 * @time 2019/10/20 14:26
 */
public class MyStack {
    private int[] elements;

    MyStack() {
        this.elements = new int[0];
    }

    // 向栈里压入元素
    public void push(int element) {
        // 创建新数组
        int[] newArr = new int[elements.length + 1];
        // 将老数组中的元素拷贝到新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        // 将新元素添加进入新数组
        newArr[elements.length] = element;
        // 新数组替换旧数组
        elements = newArr;
    }

    // 弹出栈顶元素(删除该元素)
    public int pop() {
        // 若栈为空则抛出异常
        if (elements.length == 0) {
            throw new RuntimeException("The stack is empty!");
        }
        // 取出栈顶元素
        int top = elements[elements.length - 1];
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }

        elements = newArr;
        return top;
    }

    // 取出栈顶元素(不删除)
    public int peek() {
        return elements[elements.length - 1];
    }

    // 打印栈中所有元素
    public void printStack() {
        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    // 判断栈中元素是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }

}   // 类MyStack结束
