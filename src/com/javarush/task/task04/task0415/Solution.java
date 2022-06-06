package com.javarush.task.task04.task0415;

/*
Площадь круга
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        int s = (int) (3.14 * radius * radius);
        System.out.println(s);

    }
}
