package ua.step.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * Заполните двухмерный массив размерностью NxM случайными числами и построчно
 * перенесите эти числа в одномерный массив. Вывести исходный массив и
 * полученные масcивы.
 * Пример:
 * исходный двумерный [[10, 48, 16], [61, 21, 1], [24, 84, 22], [24, 11, 27]]
 * результат [10, 48, 16, 61, 21, 1, 24, 84, 22, 24, 11, 27]
 */
public class Task06 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = 3;
        int m = 4;
        int[][] source = new int[m][n];
        int[] target = new int[m * n];
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                source[i][j] = rnd.nextInt(100);
                target[i * 3 + j] = source[i][j];
            }
        }
        System.out.println(Arrays.deepToString(source));
        System.out.println();
        System.out.println(Arrays.toString(target));
    }
}
