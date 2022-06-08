package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean x = (a == b);
        boolean y = (a == c);
        boolean z = (c == b);

        if (x & y & z) {
            System.out.println(a + " " + b + " " + c);
        } else {
            if (x) System.out.println(a + " " + b);
            if (y) System.out.println(a + " " + c);
            if (z) System.out.println(b + " " + c);
        }
    }
}

