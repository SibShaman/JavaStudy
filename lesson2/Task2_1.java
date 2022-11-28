package lesson2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL
// запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city
// = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку,
// используя StringBuilder. Значения null не включаются в запрос.

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после
// каждой итерации запишите в лог-файл.

// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя
// StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

// public class Task2_1 {

// public static void main(String[] args) throws IOException {

// File f3 = new File("/home/shaman/Рабочий
// стол/repo/JavaStudy/lesson2/person.json");
// try (BufferedReader obj = new BufferedReader(new FileReader(f3))) {
// StringBuilder sb = new StringBuilder();
// String line = obj.readLine();

// while (line != 0) {
// sb.append(line);
// sb.append(System.lineSeparator());
// line = obj.readLine();
// }
// } catch (IOException ex) {
// System.out.println(ex.getMessage());
// }

// }
// }