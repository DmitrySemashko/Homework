package ua.step.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать массив из 200 случайных чисел в диапазоне от 0 до 200. Определить
 * количество одноразрядных, двухразрядных и трёхразрядных чисел. Вывести на
 * консоль полученный массив и количество в процентах по разрядам.
 */
public class Task03 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(200);
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for (int a : arr) {
            if (a >= 0 && a <= 9) {
                count1++;
            } else if (a >= 10 && a <= 99) {
                count2++;
            } else {
                count3++;
            }
        }
        int proc1 = count1 * 100 / arr.length;
        int proc2 = count2 * 100 / arr.length;
        int proc3 = count3 * 100 / arr.length;
        System.out.println(count1 + " " + count2 + " " + count3);
        System.out.println(proc1 + " " + proc2 + " " + proc3);
    }
}
