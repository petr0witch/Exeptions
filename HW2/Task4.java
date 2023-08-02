/*
*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
* Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            Scanner sc =new Scanner(System.in);

            System.out.println("Enter a string: ");
            String str = sc.nextLine();
            if (str.isEmpty()) throw new Exception("Empty string is not allowed!") ;
            System.out.println("Nice! \n" + str);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            main(args);
        }
    }
}
