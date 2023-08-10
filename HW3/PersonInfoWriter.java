import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PersonInfoWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите: Фамилия, имя, отчество, дата, телефон, пол");
        String all = sc.nextLine();
        String[] arrAll = all.split(" ");

        if (arrAll.length >= 6) {
            try {
                String fullName = arrAll[0] + " " + arrAll[1] + " " + arrAll[2];
                String date = arrAll[3];
                String phone = arrAll[4];
                String sex = arrAll[5];

                System.out.println(fullName + " " + date + " " + phone + " " + sex);

                Person person = new Person(fullName, date, phone, sex);
                person.writeToFile();
            } catch (InvalidDataException e) {
                System.out.println("Invalid data format: " + e.getMessage());
            }
        } else {
            throw new RuntimeException("Not full info");
        }
    }
}