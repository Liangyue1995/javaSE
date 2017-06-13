package Demo1;

/**
 * Created by 梁悦 on
 * 2017/6/13.
 */
//可变参数
//在方法声明中，指定后跟省略号（...）
// 只有一个可变长度参数可以在一个方法中指定的类型，
// 这个参数必须是最后一个参数。任何常规参数必须在它前面。
public class TestDemo {
    public static void main(String[] args) {
        painMax(34,3,3,2,56.5);
        painMax(1,4,3);
    }
    private static void painMax(double... numbers){
        if(numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1;i < numbers.length;i++){
            if (numbers[i] > result){
                result = numbers[i];
                System.out.println("The max value is"+result);
            }
        }
    }
}
