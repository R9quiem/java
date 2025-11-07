package org.example;

public class Main {
    public static void main(String[] args) {
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");   // true
        Boolean b3 = Boolean.valueOf("yes");    // false, т.к. не "true"

        Boolean b4 = Boolean.TRUE;
        Boolean b5 = Boolean.FALSE;

        Boolean b9 = true; 
        Boolean b10 = false;
    }
}

