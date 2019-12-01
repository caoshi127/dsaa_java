package com.zzuli.demo02;

/**
 * 测试自定义动态数组
 */
public class TestMyArray {
    public static void main(String[] args) {
        MyArray ma = new MyArray();
        System.out.println(ma.size());

        ma.add(13);
        ma.add(14);
        ma.add(15);
        ma.add(16);
        ma.add(17);
        ma.add(18);
        ma.add(19);

        ma.show();
        System.out.println(ma.size());

        ma.delete(3);
        System.out.println(ma.get(4));
        ma.show();

        System.out.println("-------------------------------");

        ma.insert(0, 99);

        ma.show();
        ma.set(3, 999);
        ma.show();

    }
}
