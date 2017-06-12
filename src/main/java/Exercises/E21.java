package Exercises;

/**
 * Created by 梁悦 on
 * 2017/5/3.
 */
// 求1+2!+3!+...+20!的和
public class E21 {
    // 求1+2!+3!+...+20!的和
        public long get(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n * get(n - 1);
            }
        }

        public static void main(String[] args) {
            long sum = 0;
            for (int i = 1; i < 21; i++) {
                long n = 1;
                for (int j = 1; j < i + 1; j++) { // i!
                    n *= j;
                }
                sum += n;
            }
            System.out.println(sum);
        }
    }

