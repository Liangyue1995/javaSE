package Ex;

import java.util.Scanner;

/**
 * Created by 梁悦 on
 * 2017/6/9.
 */
 /*打印出杨辉三角形（要求打印出10行如下图）+
        * //     1
        * //    1 1
        * //   1 2 1
        * //  1 3 3 1
        * // 1 4 6 4 1
        * .........（略）
        *
        * 解题思路：
        * 1、找规律
        * 2、二维数组、两边都是 1，--> 左边 ints[i][0] = 1  右边 ints[i][j] = 1
        * 3、从第三行开始，每行的值 = 上一行相邻和 即 ints[i][j] = ints[i-1][j-1] + int[i-1][j]
        * 4、空格输出  -->  行i 列j  空格是 i=j 输出空格，根据 n 来计算，因为值占一个位置，所以要 -1
        * 难点： 上下行的值计算， 空格输出
        *
        * 采用二维数组
        */
public class YangHuiTriangle {
    public static void main(String[] args) {
        YangHuiTriangle yht = new YangHuiTriangle();
        yht.yanghuiFun();
    }
     public void yanghuiFun() {
        System.out.println("请输入要打印的行数:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int[][] ints = new int[n][n];
            // 先设置 二维数字两边的 值都为 1
            for (int i = 0; i < ints.length; i++) {
                // 设置左 1
                ints[i][0] = 1;
                // 设置右 1
                ints[i][i] = 1;
            }
            if (n > 2) {
                for (int i = 2; i < n; i++) {
                    // 列从 1 开始算，则需要 < n -1
                    for (int j = 1; j < n - 1; j++) {
                        // ints[i-1][j-1] 上一行左边值， int[i-1][j] 上一行右边值
                        ints[i][j] = ints[i - 1][j - 1] + ints[i - 1][j];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                // 行i 列j  空格是 i=j 输出空格，根据 n 来计算，因为值占一个位置，所以要 -1
                for (int j = i; j < n - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(ints[i][j] + " ");
                }
                System.out.println();
            }
        }
//        System.out.println("hello".concat("java").concat("world"));
    }
}