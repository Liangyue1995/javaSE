package Ex;

/**
 * Created by 梁悦 on
 * 2017/6/9.
 */
public class Exer1 {
    public static void main(String[] args) {
        System.out.print("请输入你的年龄");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int j = s.nextInt();
        if (j >=0 && j <=5){
            System.out.println("幼儿");
        }else if (j >=6 && j <=10){
            System.out.println("少儿");
        }else if (j >=11 && j <=18){
            System.out.println("少年");
        }else if (j >=19 && j <=40){
            System.out.println("壮年");
        }else if (j >=41 && j <=60){
            System.out.println("中年");
        }else if (j >=61 && j <=150){
            System.out.println("老年");
        }else {
            System.out.println("王八");
        }
    }
}
