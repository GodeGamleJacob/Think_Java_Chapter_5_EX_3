package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 7;
        int n = 9;

        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else {
            System.out.println("No, that doesn’t work.");
        }
    }
}
