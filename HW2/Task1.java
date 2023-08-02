/*
* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
* и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
* вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a float: ");
            float num = sc.nextFloat();
            System.out.println("Nice! \n" + num);

        } catch (InputMismatchException e) {
            System.out.println("Error: It's not a float number");
            main(args);
        }
    }
}
