package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Billi", 4.3d);
        grades.put("Villi", 4.5d);
        grades.put("Dilli", 4.2d);
        grades.put("Milli", 4.1d);
        grades.put("Gilli", 5.0d);
    }
}
