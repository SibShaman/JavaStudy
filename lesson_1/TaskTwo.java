// Вывести все простые числа от 1 до 1000
package lesson_1;

public class TaskTwo {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0){
                    break;
                }
                else{
                    num = i;
                }
            System.out.println(num);    
            }
        
        }
    }
}
