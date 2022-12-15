package lesson6;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

//Создать множество ноутбуков.

//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
    //“Введите цифру, соответствующую необходимому критерию:
    //1 - ОЗУ
    //2 - Объем ЖД
    //3 - Операционная система
    //4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


import java.util.HashSet;

public class Task6_1 {
    public static void main(String[] args) {
        HashSet<NoteBook> shop = new HashSet<>();
        addNoteBook(shop);


        System.out.println(shop);
    }
    public static HashSet<NoteBook> addNoteBook(HashSet<NoteBook> addshop){
        NoteBook LenovoNS = new NoteBook("Lenovo", "NS2332", "15", "8Gb", "1TB", "Linux", "black");
        NoteBook Mac = new NoteBook("Apple", "MacBook Pro", "14", "16Gb", "1TB", "Unix", "grey");
        NoteBook Huawei = new NoteBook("Huawei", "MateBook", "15", "16Gb", "2TB", "Windows10", "grey");
        NoteBook Asus = new NoteBook("ASUS", "ZenBook Flip", "13", "8Gb", "512GB", "Windows10", "blue");

        addshop.add(LenovoNS);
        addshop.add(Mac);
        addshop.add(Huawei);
        addshop.add(Asus);

        return addshop;
    }

    //Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
    // отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
    //“Введите цифру, соответствующую необходимому критерию:
    //1 - ОЗУ
    //2 - Объем ЖД
    //3 - Операционная система
    //4 - Цвет …
    //Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    //Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

    public static HashSet<NoteBook> filterNoteBook(HashSet<NoteBook> filtershop){
//        for (NoteBook notebook : filtershop) {
//
//        }


        return filtershop;
    }

}
