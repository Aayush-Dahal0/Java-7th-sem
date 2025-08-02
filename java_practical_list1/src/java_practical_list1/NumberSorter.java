//1. Write a program for to sort numbers using Array.
package java_practical_list1;
import java.util.Arrays;
import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
    	System.out.println("Aayush Dahal");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total numbers: ");
        int n = sc.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        Arrays.sort(data);
        sc.close();

        System.out.println("Sorted numbers:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}