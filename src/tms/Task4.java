package tms;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random a = new Random();

        int[] array = new int[5];
        int[] array1 = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = a.nextInt(10);
        }
        for (int i = 0; i < array1.length; i++) {
            array1[i] = a.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(" ");
        System.out.println(Arrays.toString(array1));
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i : array) {
                sum += i;
            }
            average = sum / array.length;
            System.out.println("Среднее значение чисел в массиве: " + average);
        }
        double average1 = 0;
        if (array1.length > 0) {
            double sum = 0;
            for (int i : array1) {
                sum += i;
            }
            average1 = sum / array1.length;
            System.out.println("Среднее значение чисел в массиве: " + average1);
        }
        if (average > average1) {
            System.out.println("Среднее арифметическое для первого массива больше");
        } else if (average1 > average) {
            System.out.println("Среднее арифметическое для второго массива больше");
        }else System.out.println("Их средние значения равны");
    }
}