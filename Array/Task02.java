package ua.step.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Создать массив из 20 случайных чисел в диапазоне от -10 до 30. Написать
 * программу, определяющую сумму элементов массива, находящихся в массиве после
 * первого отрицательного элемента. Вывести на консоль полученный массив и
 * сумму.
 *
 */
public class Task02
{
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] arr = new int[10];
        int sum = 0;
        int count = 0;
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = rnd.nextInt(40)-10;
            if(arr[i] < 0){
                count++;
            }
            if(count  > 0){
                sum += arr[i];
            }

        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));
    }
}
