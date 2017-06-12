package Exercise;

import java.util.Scanner;

/**
 * Created by 梁悦 on
 * 2017/6/9.
 */
/* 采用递归，一维数组*/
public class YangHuiTriangleOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入杨辉三角的行数 :");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // 行i 列j  空格是 i=j 输出空格，根据 n 来计算，因为值占一个位置，所以要 -1
            // n -1 减掉的是数字所占的未知    空格输出 -> i越小，空格越多，上层。 i 越大，空格越少，底层 。
            for (int j = 0; j < (n - 1) - i; j++) {
                System.out.print(" ");
            }
            for (int j : getArray(i + 1)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[] getArray(int n) {
        int[] ints = new int[n];
        if (n == 1) {
            return new int[]{1};
        } else {
            for (int i = 0; i < ints.length; i++) {
                if (i == 0 || i == ints.length - 1) {
                    ints[i] = 1;
                } else {
                    ints[i] = getArray(n - 1)[i - 1] + getArray(n - 1)[i];
                }
            }
            return ints;
        }

    }
}
