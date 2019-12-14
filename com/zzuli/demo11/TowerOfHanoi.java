package com.zzuli.demo11;

/**
 * 递归
 * 汉诺塔问题：
 * https://baike.baidu.com/item/%E6%B1%89%E8%AF%BA%E5%A1%94/3468295?fr=aladdin
 * 解决思路是： 无论多少个圆盘，都看成是两个，上面的所有圆盘和最底下的一个。先移动上面的所有圆盘（看成一个整体）
 * Created by CaoShi on 2019/12/14 16:57
 */
public class TowerOfHanoi {

  public static void main(String[] args) {
    hanoi(5, 'A', 'B', 'C');
  }


  /**
   * @param n    一共有N个圆盘
   * @param from 开始的柱子  A
   * @param in   中间柱子   B
   * @param to   目标柱子   C
   */
  public static void hanoi(int n, char from, char in, char to) {
    if (n == 1) {
      System.out.println("第1个圆盘从" + from + "移到" + to);
      /**
       * 无论多少个圆盘，都看成是两个，上面的所有圆盘和最底下的一个
       */
    } else {
      // 移动上面的所有圆盘到中间位置（B）
      hanoi(n - 1, from, to, in);
      // 移动下面的圆盘
      System.out.println("第" + n + "个圆盘从" + from + "移到" + to);
      // 把上面的所有圆盘从中间位置移动到目标位置（C）
      hanoi(n - 1, in, from, to);
    }
  }


}
