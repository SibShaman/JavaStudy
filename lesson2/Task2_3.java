package lesson2;
// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Напишите метод, который разберёт её на составные части и, используя
// StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task2_3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader("lesson2/rating.json"))){
            String data;
            while ((data = br.readLine()) != null){
                sb.append(data);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        // создание списка словарей
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        // и конечно сам словарь
        Map<String,String> map = new HashMap<String, String>();

        //Парсим строку, убираем лишние символы и записываем данные в словарь
        String[] keys = sb.toString().replace("{", "").
                replace("[","").
                replace("]", "").
                replace("\"", "").
                replaceAll("\\s", "").
                split("}");
        for (String data: keys) {
            System.out.println(data);

        }

//        System.out.println(dictionary);
    }
}
