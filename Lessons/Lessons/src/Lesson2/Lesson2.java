package Lesson2;

public class Lesson2 {

    public static int h; // in the heap

    public static void main(String[] args) {
        /** Variables */
        // type name = value;

        /** Numbers */
        /** Integers */
        byte numB = 5;  // 1 Byte
        short numbS;    // 2 Bytes
        int numI;       // 4 Bytes
        long numL = 5L; // 8 Bytes

        int bin = 0b1011;
        int decimal = 5;
        int hex = 0xF5;

        /** fractional numbers */
        float numF = 5.0f;  // 4 Bytes
        double numD = 5.0d; // 8 Bytes
        double numD2 = 5.0; // 8 Bytes

        /** Characters */
        char c_init = 'a'; // 2 Bytes
        char ascii = 97;   // Search ascii table
        char c;

        /** Boolean */
        boolean t = true; // 1 Byte
        boolean f = false;
        boolean state;

        /** String */
        String str = "hi";

        /** Stack */
        int s; // in the Stack

        /** Heap */
        // h is a global variable

        /** Arithmetic Operators. */
        int num1 = 2, num2 = 5;
        int res;
        res = num1 + num2; // 7
        res = num1 - num2; // -3
        res = num1 * num2; // 10
        res = num1 / num2; // 0 not 0.4 because the integer throw the floating point
        res = num2 % num1; // 1

        num1++;    // num1 = 3
        num1 += 2; // num1 = 5

        int numB1 = 0b10101, numB2 = 0b1010;
        int resB;
        resB = numB1 & numB2;   // 0b00000
        resB = numB1 | numB2;   // 0b11111
        resB = numB1 ^ 0b11111; // 0b01010

        int b = 0b1;
        b = b << 2; // 0b100
        b = b >> 1; // 0b10
        b = b >> 1; // 0b1

        /** Casting */
        int numIC = 5;
        long numLC = numIC;

        float numFC = 5.5f;
        double numDC = numFC;

        numIC = (int)(numFC); // 5

        /** Array */
        int[] arr;
        int[] arr2 = {1, 5, 2};
        int[] arr3 = new int[5]; //declaration and instantiation

    }

}
