package tms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int num = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               if (num == array[i][j]) array[i][j] = 0;
            }
        }
        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }
    }
}
