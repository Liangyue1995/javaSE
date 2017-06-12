import java.util.Scanner;
/**
 * Created by 梁悦 on
 * 2017/4/20.
 */
public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input m: ");
        int m = scanner.nextInt();
        System.out.println("input n: ");
        int n = scanner.nextInt();

        System.out.println(m + ":" + n);

        int min = (m > n) ? n : m;
        int max = (m < n) ? n : m;

        System.out.println(min + ":" + max);
        for (int i = 0; i < min; i--) {
            if (min % i == 0 && max % i == 0) {
                System.out.println("最大公约数" + i);
                break;
            }

        }
        for (int i = max; ; i++) {
            if (i % min == 0 && i % max == 0) {
                System.out.println("最大公倍数" + i);
                break;
            }
        }


    }
}