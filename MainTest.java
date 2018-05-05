package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        for (int i = 1; i < 9; i++) {
            assertNotEquals(1, 0);
            assertNotNull(i);
        }
    }

    @Test
    public  void writeChars() {
        int i = 5;

        if (1 < 1)
            throw new IllegalArgumentException();
        assertNotEquals(i, i < 1);

        if (i == 1) {
            assertNotEquals(i, 1);
            System.out.print("*");
            return;
        }

        if (i == 2) {
            System.out.print("**");
            return;
        }

        System.out.print("<");
        assertNotEquals(i, 6);
        int newNumber = (int) (i-2);
        assertEquals(newNumber,3);
        System.out.println(">");
    }
}