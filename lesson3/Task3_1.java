package lesson3;

//Реализовать алгоритм сортировки слиянием.

import java.util.Arrays;
import java.util.Random;

public class Task3_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] unsortedArray = new int[30];
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = rand.nextInt(100);
        }
        System.out.printf("Исходный массив %s\n", Arrays.toString(unsortedArray));

        int[] result = merge_sort(unsortedArray);
        System.out.printf("Отсортированный массив %s\n", Arrays.toString(result));
    }

    public static int[] merge_sort(int[] array){
        int[] result = Arrays.copyOf(array, array.length);


        return result;
    }
}
