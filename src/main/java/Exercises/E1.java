package Exercises;

/**
 * Created by 梁悦 on
 * 2017/4/19.
 */
//判断101-200之间有多少个素数，并输出所有素数。
// 素数：只能被1和它本身整除的正整数（1不是素数）
public class E1 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 101; i < 201; i++) {
            boolean b = true;
            for (int j = 2; j < i/2+1; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("素数整数是" + counter);
    }
}



