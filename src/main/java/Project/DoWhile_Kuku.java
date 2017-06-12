package Project;

/**
 * Created by 梁悦 on
 * 2017/6/12.
 */
 /*用do...while写出九九乘法表*/
public class DoWhile_Kuku {
    public static void main(String[] args) {
    int a=1;
        do {
        int b = 1;
          do {
            System.out.print(b+"*"+a+"="+(a*b)+"\t");
            b++;
        }while (b <= a);
        System.out.println();
        a++;
    }while (a++ <= 9);
  }
}
