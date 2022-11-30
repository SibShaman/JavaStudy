package lesson2;
//В файле содержится строка с исходными данными в такой форме:
//          {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//          Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
//          SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Task2_1 {
    public static void main(String[] args) throws IOException{

        // Читаем из файла и запысываем в StringBuilder sb
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader("lesson2/person.json"))){
            String data;
            while ((data = br.readLine()) != null){
                sb.append(data);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(sb);



    }
}