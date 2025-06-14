package exceptionPackage;
import java.util.Scanner;

public class ConceptofException {
	public static int divide(int num, int deno) {
		return num/deno;
		
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n, d; 
		System.out.println("Enter numerator");
		n=input.nextInt();
		System.out.println("Enter denominator");
		d=input.nextInt();
		System.out.println("quotient=" +divide(n,d));

	}

}
