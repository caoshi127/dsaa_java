package com.zzuli.demo08;

/**
 *  双向循环链表
 *  实现注意：
 *      一定要初始化！！原始循环链表只有有个节点， 那么当前节点的上一个和下一个节点均为当前节点本身。
 *
 * @author CaoShi
 * @time 2019/12/1 19:12
 */
public class DoubleLoopNode {

    private int data;                          // 数据域
    private DoubleLoopNode preNode;     // 当前节点的上一个节点
    private DoubleLoopNode nextNode;    // 当前节点的下一个节点

    public DoubleLoopNode(int data) {
        this.data = data;
        this.preNode = this;        // 初始化当前节点的上一个节点为本身
        this.nextNode = this;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleLoopNode next() {
        return nextNode;
    }

    public DoubleLoopNode pre() {
        return preNode;
    }


    /**
     * 在当前节点后面插入一个新节点
     * @param node
     */
    public void after(DoubleLoopNode node) {
        // 当前节点的下一个节点
        DoubleLoopNode nextNext = nextNode;
        // 新节点作为当前节点的下一个节点
        this.nextNode = node;
        // 新节点的上一个节点为当前节点
        node.preNode = this;
        // 新节点的下一个节点为当前节点的下一个节点
        node.nextNode = nextNext;
        nextNext.preNode = node;
    }

    /**
     * 打印循环链表的所有元素
     * @param head  “头”节点， 实质上是任意节点，只不过是第一个打印出的
     */
    public static StringBuilder printAllNode(DoubleLoopNode head) {
        DoubleLoopNode curNode = head;
        StringBuilder resultStr = new StringBuilder();      // 最终打印的字符串
        do {
            resultStr.append(curNode.getData()).append("->");
            curNode = curNode.nextNode;
        } while (curNode != head);
        resultStr.delete(resultStr.length() - 2, resultStr.length());       // 去除最后一个 "->"
        return resultStr;
    }

}
