package ua.step.homework;

import java.util.Scanner;

/**
 * Заполните n мерный квадратный массив числами, которые увеличиваются на 1 по
 * спирали (число n должно задаваться с клавиатуры). Выведите результат на экран
 * с соблюдением ширины столбцов. Выполнить задачу с использованием только
 * одного цикла. Для примера массив 4 на 4 должен выглядеть как указано ниже.
 * <p>
 * 1  2  3 4
 * 12 13 14 5
 * 11 16 15 6
 * 10  9  8 7
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = n;

        for (int i = 0; i < n * n; i++) {
            matrix[row][col] = i + 1;
            if (--visits == 0) {
                visits = n * (dirChanges % 2) +
                        n * ((dirChanges + 1) % 2) -
                        (dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;
            }
            col += dx;
            row += dy;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }
}

