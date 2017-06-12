package Ex;

/**
 * Created by 梁悦 on
 * 2017/6/9.
 */
public class Calculator {
    private int x;
    private int y;


    public Calculator() {
    }

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // x + y
    public int add(int x,int y) {
        return x + y ;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4,6));
    }
}
