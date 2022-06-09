package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean a1 = (x > 0 && y > 0);
        boolean a2 = (x < 0 && y > 0);
        boolean a3 = (x < 0 && y < 0);
        boolean a4 = (x > 0 && y < 0);

        if (a1) System.out.println(1);
        if (a2) System.out.println(2);
        if (a3) System.out.println(3);
        if (a4) System.out.println(4);
    }
}
