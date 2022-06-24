package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int number = sc.nextInt();

        if (number <= 0 || number >= 5) {
            System.out.println(str);
        } else {
            int i = 1;
            do {
                System.out.println(str);
                i++;
            } while (i <= number);
        }
    }
}