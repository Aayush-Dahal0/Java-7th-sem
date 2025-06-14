package exceptionPackage;

import java.util.InputMismatchException;
import java.util.Scanner;
class OwnException extends Exception{
	public OwnException(String definition) {
		super (definition);
	}
}
public class CustomException {
	public static void validAge(int age) throws OwnException {
		if(age<=0) {
			throw new OwnException("Age less than zero exception");
		}
		else {
			System.out.println("Valid age");
		}
		
	}

	public static void main(String[] args) throws OwnException {
		boolean valid =true;
		int age;
		Scanner input=new Scanner(System.in);
		do {
		try {
			System.out.println("Enter your age");
			age=input.nextInt();
			validAge(age);
			valid=false;

		}
		catch(InputMismatchException ex) {
			System.err.println("Exception is "+ex);
			input.nextLine();
			System.out.println("Enter integer data");
		}
		catch(OwnException ex) {
			System.err.println("Exception is "+ ex);
			System.out.println("Enter positive integer");
		}
		}
		while(valid);
		System.out.println("Code below exception handled");
		}
	}

	
