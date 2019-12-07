package com.zzuli.demo10;

/**
 * 斐波那契数列:
 *  1   1   2   3   5   8   13 ...
 */
public class TestFebonacci {

  public static void main(String[] args) {
    int res = febonacci(3);
    System.out.println(res);
  }

  /**
   * 获取斐波那契数列的每一项
   * @param i
   * @return
   */
  public static int febonacci(int i) {
    if (i == 1 || i == 2) {   // 递归结束的条件
      return 1;
    } else {
      return febonacci(i - 1) + febonacci(i - 2);
    }
  }

}
