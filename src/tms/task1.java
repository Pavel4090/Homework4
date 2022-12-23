package tms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1 {
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
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        num = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (num == array[i][j]) {
                    System.out.println("Введённое число входит в массив");
                } else {
                    System.out.println("Введённое число не входит в массив");
                }
            }
        }
    }
}


