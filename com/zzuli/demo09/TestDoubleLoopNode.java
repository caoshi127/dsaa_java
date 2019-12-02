package com.zzuli.demo09;

public class TestDoubleLoopNode {
    public static void main(String[] args) {
        DoubleLoopNode n1 = new DoubleLoopNode(4);
        DoubleLoopNode n2 = new DoubleLoopNode(5);
        DoubleLoopNode n3 = new DoubleLoopNode(6);
        DoubleLoopNode n4 = new DoubleLoopNode(9);

        n1.addNode(n2);
        n2.addNode(n3);
        n3.addNode(n4);

        System.out.println(n1.getNext().getData());
        System.out.println(n2.getNext().getData());
        System.out.println(n3.getNext().getData());
        System.out.println(n4.getNext().getData());

        DoubleLoopNode.printAllNode(n1);


    }
}
