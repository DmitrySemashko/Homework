package ua.step.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать массив размерности m x n заполненный случайными числами от -33 до
 * +55. Вывести на экран исходный массив и строку или столбец для которого
 * средне арифметическое его элементов максимально отличается от среднее
 * арифметического значения для всех элементов массива. Размерности массива
 * должна задаваться с клавиатуры.
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Input n and m");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int average = 0;
        int[][] arr = new int[n][m];
        int sum = 0;
        int matrixSize = n * m;
        int sumString = 0;
        int sumColumn = 0;
        int averageString = 0;
        int averageColumn = 0;
        int deference = 0;
        int deference1 = 0;
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(88) - 33;
                sum += arr[i][j];
                average = sum / matrixSize;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; i++) {
                sumString += arr[i][j];
                averageString = sumString / m;
                deference = average - averageString;
                if (max1 < deference) {
                    deference = max1;
                }
            }
            sumString = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumColumn += arr[j][i];
                averageColumn = sumColumn / n;
                deference1 = average - deference1;
                if (max2 < deference1) {
                    max2 = deference1;
                }
                sumColumn = 0;
            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println(sum + " " + average + " ");
    }
}