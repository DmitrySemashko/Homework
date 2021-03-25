package ua.step.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * В кинотеатре n рядов по m мест в каждом (m и n должно задаваться с
 * клавиатуры). В двумерном массиве размерностью m на n хранится информация о
 * проданных билетах. Число 1 означает, что билет на данное место уже продано,
 * число 0 означает, что место свободно. Поступил запрос на продажу k билетов на
 * соседние места в одном ряду (k должно задаваться с клавиатуры). Определите,
 * можно ли выполнить такой запрос. Если решения есть, вывести номера рядов и
 * номера свободных мест для продажи. Число занятых мест и какие места заняты на
 * момент запроса определите случайным образом. Вывести исходный массив на
 * экран. Вывести ряд и номера доступных мест.
 */
public class Task10 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введете число рядов");
        int n = scanner.nextInt();
        System.out.println("Введете число мест в ряду");
        int m = scanner.nextInt();
        System.out.println("Введете число искомых мест");
        int k = scanner.nextInt();
        int[][] cinema = new int[n][m];
        int count = 0;
        int max = 0;
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                cinema[i][j] = r.nextInt(2);
                if (cinema[i][j] == 0) {
                    count++;
                } else {
                    count = 0;
                }
                if (count > max) {
                    max = count;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if (cinema[i][j] == 0) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter >= k) {
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println(Arrays.deepToString(cinema));
    }
}