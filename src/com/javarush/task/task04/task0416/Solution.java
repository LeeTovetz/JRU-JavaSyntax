package com.javarush.task.task04.task0416;

import java.util.Scanner;

/*
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = 1.0 * a / b;

        System.out.println(c);

    }
}