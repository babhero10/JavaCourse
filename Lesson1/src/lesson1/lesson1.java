package lesson1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class lesson1 {
    public static void main(String[] args) {

        //System.out.print("Hello, World!\n");
        /**/
        // byte, short, int, long, float, double, char, boolean
        // string
        //int b = 45;
        // 0b01 | 0b10 = 0b11;
        // 0b01 & 0b10 = 0b11;

        /*
        System.out.println(b); // 2
        b = b << 2;
        System.out.println(b); // 8
        b = b >> 1;
        System.out.println(b); // 4
        b = b >> 1;
        System.out.println(b); // 2
        */
        /*
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        System.out.println(a);
        */
        // JOptionPane.showMessageDialog(null, "Hello");
        /*
        YES: 0, NO: 1, Cancel: 2, close: -1
        int a;
        a = JOptionPane.showConfirmDialog(null, "Hello");
        System.out.println(a);
        a = JOptionPane.showConfirmDialog(null, "Hello");
        System.out.println(a);
        a = JOptionPane.showConfirmDialog(null, "Hello");
        System.out.println(a);
        a = JOptionPane.showConfirmDialog(null, "Hello");
        System.out.println(a);
        */

        String s;
        s = JOptionPane.showInputDialog(null, "hallo");
        System.out.println(s.length());
        s = JOptionPane.showInputDialog(null, "hallo");
        System.out.println(s.length());
        s = JOptionPane.showInputDialog(null, "hallo");
        System.out.println(s.length());

    }
}
