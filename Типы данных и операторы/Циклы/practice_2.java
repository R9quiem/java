package org.example;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while(true) {
            i++;
            if(i==3) continue; //пропустит при i = 3
            if(i==5) break; //завершит при i=5
            System.out.println(i);
        }
    }
}

