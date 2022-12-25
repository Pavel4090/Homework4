package homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrayx {
    public static void main(String[] args) {
        int[][][] array = new int[5][5][5];
        Random a = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = a.nextInt(10);
                }
            }
        }
        System.out.println(Arrays.deepToString(array) + " ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для увеличения: ");
        int c = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = array[i][j][k] + c;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}

