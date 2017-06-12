package Ex;

import javax.swing.*;

/**
 * Created by 梁悦 on
 * 2017/6/12.
 */
public class KuKuTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "*" + i + "=" + (i * k) + "\t");
            }
            System.out.println();
        }
    }
}