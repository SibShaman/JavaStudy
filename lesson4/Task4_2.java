package lesson4;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя

import java.util.LinkedList;
import java.util.Random;

public class Task4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            originalList.add(i, rand.nextInt(100));
        }
        System.out.printf("Исходный список: %s \n", originalList);
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int num){



        return list;
    }
}
