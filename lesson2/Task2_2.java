package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task2_2 {
    // Реализуйте алгоритм сортировки пузырьком числового массива, результат после
    // каждой итерации запишите в лог-файл.
    public static void main(String[] args) {
        int[] data = new int[20];
        for (int i = 0; i < data.length; i++) {
            Random rand = new Random();
            data[i] = rand.nextInt(100);
        }
        System.out.printf("Вывод неотсортированного массива: %s\n", Arrays.toString(data));

        int i = 0;
        boolean flag = true;
        while (i < data.length - 1) {
            flag = false;
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]) {
                    int temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            i++;
        }
        System.out.printf("Вывод отсортированного массива: %s\n", Arrays.toString(data));
    }
}
