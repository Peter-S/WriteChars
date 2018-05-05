package com.company;

public class Main {

    public static void main(String[] args) {
//        A for-i loop to generate variable i for writeChars
        for (int i = 1; i < 9; i++) {
            writeChars(i);
            System.out.println();
        }
    }

//      writeChars method
    public static void writeChars(int i) {
//        throws Exception if i less then 1
        if (i < 1)
            throw new IllegalArgumentException();

//        Base case / i equals 1, prints single *
        if (i == 1) {
            System.out.print("*");
            return;
        }

//        base case 2 / i = 2, print two *'s
        if (i == 2) {
            System.out.print("**");
            return;
        }

//        prints < when i >= 3
        System.out.print("<");
//        recursive part / method calls itself /
//          prints < to left of * or ** / uses i - 2 for next variable.
        writeChars(i -2);
//        finishes method and prints > to right of * or **
        System.out.print(">");
    }
}
