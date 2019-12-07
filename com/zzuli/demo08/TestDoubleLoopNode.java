package com.zzuli.demo08;

public class TestDoubleLoopNode {
    public static void main(String[] args) {
        DoubleLoopNode n1 = new DoubleLoopNode(2);
        DoubleLoopNode n2 = new DoubleLoopNode(3);
        DoubleLoopNode n3 = new DoubleLoopNode(4);

        n1.after(n2);
        n2.after(n3);

        System.out.println(n1.getData());                   // 2
        System.out.println(n1.next().getData());            // 3

        System.out.println(n1.next().next().getData());     // 4

        System.out.println(n3.pre().getData());             // 3
        System.out.println(n3.pre().pre().getData());       // 2
        System.out.println(n2.pre().getData());             // 2

        StringBuilder allNode = DoubleLoopNode.printAllNode(n1);

        System.out.println(allNode);

    }


}
