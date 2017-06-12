package Project;

/**
 * Created by 梁悦 on
 * 2017/6/12.
 */
// 用while写出九九乘法表
public class While_Kuku {
    public static void main(String[] args) {
        int i = 0;
        while (++i <= 9) {
            int j = 0;
            while (++j <= i) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }
    }

