//3. Write a program to create Own Exceptions(Custom Exceptions).
import java.util.Scanner;

class InvalidAgeException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Q03_CustomException {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        try {
            int age = scanner.nextInt();
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
