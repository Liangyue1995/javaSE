package Exercises;

/**
 * Created by 梁悦 on
 * 2017/4/20.
 */
public class E2 {
    public static void main(String[] args) {
//        int i, j,sum=0;
        for (int i = 1; i < 1000; i++) {
            int sum=0;
            for (int j = 1; j <i/2+1 ; j++) {
                if(i%j==0){
                    sum +=j;
                }
            }
            if(i==sum)
            System.out.println(sum);
        }
    }
}
