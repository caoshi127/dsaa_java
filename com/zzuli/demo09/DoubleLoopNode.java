package com.zzuli.demo09;

/**
 *  双向循环链表, 改进新增节点的方法.
 */
public class DoubleLoopNode {

    private int data;
    private DoubleLoopNode pre;
    private DoubleLoopNode next;

    public DoubleLoopNode(int data) {
        this.data = data;
        this.pre = this;
        this.next = this;
    }

    public int getData() {
        return data;
    }

    public DoubleLoopNode getPre() {
        return pre;
    }

    public DoubleLoopNode getNext() {
        return next;
    }

    /**
     * 新增节点， 不需要保存之前的下一个节点
     *
     * @param node
     */
    public void addNode(DoubleLoopNode node) {
        node.next = this.next;
        this.next.pre = node;
        this.next = node;
        node.pre = this;
    }

    public static void printAllNode(DoubleLoopNode head) {
        DoubleLoopNode cur = head;
        do {
            System.out.print(cur.getData() + "->");
            cur = cur.next;
        } while (cur != head);
    }


}
