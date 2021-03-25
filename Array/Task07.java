package ua.step.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать квадратный массив размерностью NxN заполненный случайными числами,
 * вывести массив на экран в виде таблицы, найти наименьший и наибольший элемент
 * массива и вывести их на экран (если найдено несколько одинаковых элементов —
 * вывести через запятую индексы строки и столбца, где есть повторения). Вывести
 * на экран время выполнения поиска, в миллисекундах. Размерность массива должна
 * задаваться с клавиатуры.
 */
public class Task07 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введете n");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(100);
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == max){
                    System.out.println(i + " " + j);
                }
                if (arr[i][j] == min){
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(max + " " + min);
    }
}
