package Demo1;

/**
 * Created by 梁悦 on
 * 2017/6/13.
 */
//如何定义一个方法，如何调用它
public class TestMax {
    //主方法
    // Main method
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximun between" + i + "and" + j + "is" + k);
    }
    // 返回两个数字之间的最大值
    // Return the max between two numbers
    private static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}
