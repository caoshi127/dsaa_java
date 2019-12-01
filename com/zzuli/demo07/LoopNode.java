package com.zzuli.demo07;

/**
 * 循环链表（单向）
 */
public class LoopNode {

    private int data;       // 数据域

    private LoopNode next = this;   // 下一个节点

    // 构造节点
    public LoopNode(int data) {
        this.data = data;
    }

    // 获取节点数据
    public int getData() {
        return this.data;
    }

    // 设置节点数据
    public void setData(int data) {
        this.data = data;
    }

    // 追加节点
    public LoopNode append(LoopNode node) {
        // 当前节点
        LoopNode currentNode = this;
        // 通过循环找到链表的尾节点
        while (true) {
            LoopNode nextNode = currentNode.next;
            // 下一个节点为null, 说明此时的currentNode是尾节点
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        // 已经走到链表尾节点, 将要追加的节点追加上去
        currentNode.next = node;

        return this;
    }

    // 获取当前节点的下一个节点
    public LoopNode next() {
        return this.next;
    }

    // 遍历链表中的元素
    public void printNode() {
        // 当前节点
        LoopNode currentNode = this;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    /**
     * 节点增删改查
     */
    // 删除节点(实际上删除的是当前节点的下一个节点)
    public void removeNode() {
        // 当前节点
        LoopNode currentNode = this;
        if (this.next != null) {
            currentNode.next = this.next.next;
        }
    }

    // 插入节点, 将新节点插入当前节点的下一个位置
    public void addNode(LoopNode node) {
        // 取出当前节点的下一个节点
        LoopNode nextNode = this.next;
        // 新节点插入
        this.next = node;
        // 新节点的下一个节点为插入之前的下一个节点
        node.next = nextNode;
    }

    // 修改节点data值
    public void modifyNode(int newData) {
        this.setData(newData);
    }
}
