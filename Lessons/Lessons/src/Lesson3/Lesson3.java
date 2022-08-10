package Lesson3;

import java.util.Scanner;
import javax.swing.*;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.print("Hello, World!\n");

        int res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        res = sc.nextInt();
        System.out.println(res);

        JOptionPane.showMessageDialog(null, "Hello");

        // YES: 0, NO: 1, Cancel: 2, close: -1
        int a;
        a = JOptionPane.showConfirmDialog(null, "Hello");
        System.out.println(a);
        a = JOptionPane.showConfirmDialog(null, "Hello");
        System.out.println(a);
        a = JOptionPane.showConfirmDialog(null, "Hello");
        System.out.println(a);
        a = JOptionPane.showConfirmDialog(null, "Hello");
        System.out.println(a);

        // Ok: the string, cancel: null, close: null
        String s;
        s = JOptionPane.showInputDialog(null, "hallo");
        System.out.println(s.length());
        s = JOptionPane.showInputDialog(null, "hallo");
        System.out.println(s.length());
        s = JOptionPane.showInputDialog(null, "hallo");
        System.out.println(s.length());
    }
}
