package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        System.out.println(Arrays.toString(arr1)); // [1, 2, 3]

        int[] arr2 = {5, 1, 3};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); // [1, 3, 5]

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b)); // true

        int[] arr = {1, 3, 5, 7};
        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index); // 2

        int[] a1 = {1, 2, 3};
        int[] b1 = {1, 2, 3};
        int[] c1 = {1, 3, 2};

        System.out.println(Arrays.compare(a1, b1)); 
        System.out.println(Arrays.compare(a1, c1)); 
        System.out.println(Arrays.compare(c1, a1)); 
    }
}
