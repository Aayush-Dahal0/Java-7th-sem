//6. Write a program to create user defined exception and its use.
package java_practical_list1;
import java.util.Scanner;

// Custom exception
class InvalidAgeException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age must be 18 or above.");
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        scanner.close();
    }
}
