import java.io.FileWriter;
import java.io.IOException;

class Person {
    private String fullName;
    private String dateOfBirth;
    private String phoneNumber;
    private String sex;

    public Person(String fullName, String dateOfBirth, String phoneNumber, String sex) throws InvalidDataException {
        this.fullName = fullName;

        if (!isValidDate(dateOfBirth)) {
            throw new InvalidDataException("Invalid date format");
        }
        this.dateOfBirth = dateOfBirth;

        if (!isValidPhoneNumber(phoneNumber)) {
            throw new InvalidDataException("Invalid phone number format");
        }
        this.phoneNumber = phoneNumber;

        if (!isValidSex(sex)) {
            throw new InvalidDataException("Invalid sex value");
        }
        this.sex = sex;
    }

    private boolean isValidDate(String date) {
        // Add your date validation logic here
        return true;
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        // Add your phone number validation logic here
        return true;
    }

    private boolean isValidSex(String sex) {
        return sex.equals("m") || sex.equals("f");
    }

    public void writeToFile() {
        String filename = fullName.split(" ")[0] + ".txt";

        try (FileWriter writer = new FileWriter(filename)) {
            String data = fullName + ", " + dateOfBirth + ", " + phoneNumber + ", " + sex;
            writer.write(data);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}