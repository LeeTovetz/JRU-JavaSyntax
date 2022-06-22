package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min1 = console.nextInt();
        int min2 = console.nextInt();
        if (min2 < min1) {
            int tmp = min1;
            min1 = min2;
            min2 = tmp;
        }

        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (min1 == min2) {
                if (x < min1) {
                    min1 = x;
                } else {
                    min2 = x;
                }
            } else if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x > min1 && x < min2) {
                min2 = x;
            }
        }
        System.out.println(min2);
    }
}