package ua.step.homework;

import java.util.Scanner;

/**
 * Задача со звездочкой.
 * Ввести c клавиатуры число в диапазоне от 0 до 1000000. Озвучить его словами.
 * Например, при вводе числа 125 вывести на экране «сто двадцать пять».
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введете число ");
        int numbers = scanner.nextInt();
        String[] str = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] str10 = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
                "восемьдесят", "девяносто"};
        String[] str11 = {"", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
                "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать"};
        String[] str100 = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот",
                "девятьсот"};
        String number = String.valueOf(numbers);
        String numberString = "";
        if (number.length() == 1)
            number = "00" + number;
        if (number.length() == 2)
            number = "0" + number;
        int num1 = (int) Integer.valueOf(number.substring(0, 1));
        int num2 = (int) Integer.valueOf(number.substring(1, 2));
        int num3 = (int) Integer.valueOf(number.substring(2, 3));
        int num4 = (int) Integer.valueOf(number.substring(1, 3));
        if (numbers == 0) {
            System.out.println("ноль");
        }
        if (numbers > 99)
            numberString += str100[num1] + " ";
        if (num4 > 20) {
            numberString += str10[num2] + " ";
            numberString += str[num3] + " ";
        } else {
            if (num4 > 9)
                numberString += str11[num4 - 9] + " ";
            else
                numberString += str[num3] + " ";
        }
        System.out.println(numberString);
    }
}
