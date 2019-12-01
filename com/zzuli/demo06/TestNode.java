package com.zzuli.demo06;

public class TestNode {

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(4);
        Node n3 = new Node(6);
        Node n4 = new Node(8);
        Node n5 = new Node(9);

        Node n = n1.append(n2).append(n3).append(n4).append(n5);

        System.out.println(n1.next().getData());
        System.out.println(n5.isLast());        // n5是尾节点 true
        n.printNode();      // 2 4 6 8 9

        // n1.removeNode();

        n.printNode();

        n3.addNode(new Node(99));

        n.printNode();

        n3.modifyNode(88);
        n.printNode();


    }

}
