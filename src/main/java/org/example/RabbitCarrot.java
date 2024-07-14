package org.example;

import java.util.Arrays;
import java.util.Collections;

public class RabbitCarrot {
    public static void main(String[] args) {
        // Массив с массой моркови на каждой полянке
        Integer[] carrots = {1, 2, 3, 4, 5};

        // Сортируем массив в обратном порядке, чтобы начинать с самой тяжелой моркови
        Arrays.sort(carrots, Collections.reverseOrder());

        int totalWeight = 0;
        int trips = 10;
        int maxWeightPerTrip = 5;

        for (int i = 0; i < trips; i++) {
            int currentWeight = 0;
            for (int j = 0; j < carrots.length; j++) {
                if (carrots[j] > 0 && currentWeight + carrots[j] <= maxWeightPerTrip) {
                    currentWeight += carrots[j];
                    carrots[j] = 0; // Убираем морковь с полянки, так как она уже взята
                }
            }
            totalWeight += currentWeight;
        }

        System.out.println("Максимальное количество моркови, которое заяц может унести за 10 ходок: " + totalWeight + " кг");
    }
}