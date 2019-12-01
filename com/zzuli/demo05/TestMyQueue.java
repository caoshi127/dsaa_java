package com.zzuli.demo05;

/**
 * @author CaoShi
 * @time 2019/10/20 15:38
 */
public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.add(5);
        mq.add(6);
        mq.add(8);
        mq.add(10);

        System.out.println(mq.poll());
        mq.add(9);
        System.out.println(mq.poll());
        System.out.println(mq.poll());
    }
}
