package com.javarush.task.pro.task13.task1328;

import java.util.*;

/* 
Достижения
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "Один маленький шаг");
        map.put(5, "Дай 5");
        map.put(10, "В 10-ку");
        map.put(50, "50 оттенков кодинга");
        map.put(100, "Центурион");
        map.put(200, "Эффективность 200%");
        map.put(300, "300 спартанцев");
        map.put(400, "Забег на 400");
        map.put(500, "Багам здесь не место");
        map.put(600, "600 выстрелов в минуту");
        map.put(700, "Сезон охоты");
        map.put(800, "Стальной кодер");
        map.put(900, "100500 багов спустя");

        int tasksCount = 150;

        SortedMap<Integer, String> reachedAchievements = getReachedAchievements(map, tasksCount);
        for (Map.Entry<Integer, String> entry : reachedAchievements.entrySet()) {
            System.out.printf("У тебя есть достижение \"%s\" за %d решенных задач%n", entry.getValue(), entry.getKey());
        }

        System.out.printf("%nСейчас у тебя %d решенных задач%n%n", tasksCount);

        SortedMap<Integer, String> futureAchievements = getFutureAchievements(map, tasksCount);
        for (Map.Entry<Integer, String> entry : futureAchievements.entrySet()) {
            System.out.printf("Ты получишь достижение \"%s\", если решишь %d задач%n", entry.getValue(), entry.getKey());
        }
    }

    public static SortedMap<Integer, String> getReachedAchievements(TreeMap<Integer, String> map, Integer tasksCount) {
        return map.headMap(tasksCount + 1);
    }

    public static SortedMap<Integer, String> getFutureAchievements(TreeMap<Integer, String> map, Integer tasksCount) {
        return map.tailMap(tasksCount + 1);
    }
}