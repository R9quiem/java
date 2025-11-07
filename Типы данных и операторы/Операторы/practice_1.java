package org.example;


public class Main {
    public static void main(String[] args) {
        int a = 10;
        a += 5; a -= 2; a *= 3; a /= 4; a %= 3;
        System.out.println(a);

        String s = "Hi";
        s += " there";
        System.out.println(s);

        int n = 7;
        String t = (n % 2 == 0) ? "even" : "odd";
        System.out.println(t);

        System.out.println(true || false);
        System.out.println(true && false);
        System.out.println(5 | 3);
        System.out.println(5 ^ 3);
        System.out.println(5 & 3);
        System.out.println(5 == 3);
        System.out.println(5 > 3);
        System.out.println(5 >= 3);
        System.out.println(5 < 3);
        System.out.println(5 <= 3);
        System.out.println(8 >> 1);
        System.out.println(8 >>> 1);
        System.out.println(8 << 1);
        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println("Hello " + "world");
        System.out.println(5 * 3);
        System.out.println(5 / 2);
        System.out.println(5 % 2);

        int x = 5;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        System.out.println(~x);
        System.out.println(!false);

        int y = (2 + 3) * 4;
        System.out.println(y);

        int[] arr = {10, 20, 30};
        System.out.println(arr[1]);
    }
}

