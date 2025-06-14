package exceptionPackage;
import java.util.InputMismatchException;

import java.util.Scanner;

public class ExceptionHandling {
	public static int divide(int num, int deno) {
		return num/deno;
		
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n, d;
		boolean loopcontinue=true;
		do {
		
		try {
	
			System.out.println("Enter numerator");
			n=input.nextInt();
			System.out.println("Enter denominator");
			d=input.nextInt();
			System.out.println("quotient=" +divide(n,d));
			loopcontinue=false;
		}
		catch(InputMismatchException ex) {
			System.err.println("Exception is "+ex);
			input.nextLine();
			System.out.println("Enter integer data");
		}
		catch (ArithmeticException ex) {
			System.err.println("Exception is"+ ex);
			System.out.println("Enter non-zero denominator");
		}
		}while(loopcontinue);
		System.out.println("Very important code here");
		

	}

}
