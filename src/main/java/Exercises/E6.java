package Exercises;

import java.util.Scanner;
/**
 * Created by 梁悦 on
 * 2017/4/20.
 */
//输入两个正整数m和n，求其最大公约数和最小公倍数。
public class E6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input m: ");
        int m = scanner.nextInt();
        System.out.println("input n: ");
        int n = scanner.nextInt();

        System.out.println(m + ":" + n);

        int min = (m > n) ? n : m;
        int max = (m < n) ? n : m;
      //  System.out.println(min + ":" + max);
        for (int i = min; i>0; i--) {
            if (min % i == 0 && max % i == 0) {
                System.out.println("最大公约数" + i);
                break;
            }
        }
        for (int i = max; i< min * max + 1; i++) {
            if (i % min == 0 && i % max == 0) {
                System.out.println("最小公倍数："+i);
                break;
            }
        }
    }
}