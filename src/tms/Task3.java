package tms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int x;
        Random a = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размар массива: ");
        x = sc.nextInt();
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = a.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимально число: " + max);
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i : array) {
                sum += i;
            }
            average = sum / array.length;
            System.out.println("Среднее значение чисел в массиве: " + average);
        }
    }
}
