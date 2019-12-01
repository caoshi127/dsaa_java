package com.zzuli.demo04;
/**
 * 测试类
 * @author CaoShi
 * @time 2019/10/20 14:27
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        // 压栈
        ms.push(1);
        ms.push(3);
        ms.push(6);
        ms.push(9);

//        ms.printStack();
//        System.out.println(ms.peek());
//
//        System.out.println(ms.pop());
//        ms.printStack();
        // 弹栈
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        // 打印栈中元素
        ms.printStack();

    }

}
