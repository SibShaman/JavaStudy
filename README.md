# JavaStudy

lesson1

Task1_1
    Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

Task1_2
    Вывести все простые числа от 1 до 1000

Task1_3
    Реализовать простой калькулятор

lesson2

Task2_1
    В файле содержится строка с исходными данными в такой форме: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
    SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
    Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.


Task2_2
    Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


Task2_3
    Напишите метод, который разберёт её на составные части и, используя
    StringBuilder создаст массив строк такого вида:
    Студент Иванов получил 5 по предмету Математика.
    Студент Петрова получил 4 по предмету Информатика.
    Студент Краснов получил 5 по предмету Физика.
    В файле содержится строка с данными:
    [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
    {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
    {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

lesson3

Task3_1
    Реализовать алгоритм сортировки слиянием.

Task3_2
    Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

Task3_3
    Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

Task3_4
    *. (Необязательная задача повышенной сложности)
       Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
       Разность:
       A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
       B - A = все числа из второй коллекции, которые не содержатся в первой
       Симметрическая разность:
       A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой




