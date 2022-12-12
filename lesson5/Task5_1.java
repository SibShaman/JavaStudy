package lesson5;

//Реализуйте структуру телефонной книги с помощью HashMap,
//        учитывая, что один человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;

public class Task5_1 {
    public static void main(String[] args) {
        //список словарей (по задумке, индекс списка это id контакта, словарь соответственно это телефонная книга)
        HashMap<ArrayList<String>, HashMap<String, String>> phoneBook = new HashMap<>();
        ArrayList<String> numberPhone = new ArrayList<>();
        HashMap<String, String> keyValues = new HashMap<>();

    }

    public static ArrayList<String> addNumberPhone(ArrayList<String> number){
        //numberPhone - список  который потом будет заноситься в ключ словаря phoneBook
        return number;
    }

    public static HashMap<String,String> addDescription(HashMap<String, String> keyValue) {
        // В общем это словарь значений, который потом заносится в словарь phoneBook
        // firstName
        // secondName
        // description


        return keyValue;
    }
}
