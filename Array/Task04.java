package ua.step.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать массив из 100 случайных чисел в диапазоне от - 300 до 555. Написать
 * программу, копирующую один массив в другой следующим образом: сначала
 * копируются последовательно все элементы, большие 0, затем последовательно все
 * элементы, равные 0, а затем последовательно все элементы, меньшие 0. Вывести
 * исходный массив. Вывести результирующий массив.
 */
public class Task04 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1110) - 300;
        }
        System.out.print(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println();
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            if (arr[i] > 0) {
                result[i] = arr[i];
            } else if (arr[i] == 0) {
                result[i] = arr[i];
            } else {
                result[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}