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
                array[i][j] = random.nextInt(19);
            }
        }
        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        num = sc.nextInt();
        boolean c = false;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (num == anInt) {
                    c = true;
                    break;
                }
            }
        }
        if (c) {
            System.out.println("Число входит в массив");
        } else System.out.println("Число не входит в массив");
    }
}


