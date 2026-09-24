package by.itstep.lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumbers {
    public int[] fibonacciNumbers() {

        Scanner scanner = new Scanner(System.in);
        int lengthArr = scanner.nextInt();

        int arr[] = new int[lengthArr];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < lengthArr; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;


    }
}
