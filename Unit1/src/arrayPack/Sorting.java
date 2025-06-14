package arrayPack;

import java.util.Scanner;

public class Sorting {

	public void SortingNum(int[] num, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		displayArray(num, n);
	}

	public void displayArray(int num[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", num[i]);
			// System.out.println(num[i]+"");

		}

	}

	public void SortingName(String[] names, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}

			}
		}
		System.out.println("Alphabetically Sorted Names are ");

		for (int i = 0; i < n; i++) {
			System.out.print(names[i] + " ");
		}
	}

	public static void main(String[] args) {
		int n;
		int num[] = new int[10];// 40 bytes memory
		String[] names = new String[20];
		Scanner input = new Scanner(System.in);// user input from keyboard
		System.out.println(); // sysout_ctrl+space
		n = input.nextInt();// n initializes with the value
		for (int i = 0; i < n; i++) {
			num[i] = input.nextInt();// scanf("%d",&num[i];, cin>>num[i]
		}
		Sorting sor = new Sorting();
		sor.SortingNum(num, n);
		System.out.println("Enter the names of Sorting");
		for (int i = 0; i < n; i++) {
			names[i] = input.nextLine();// scanf("%d",&num[i];, cin>>num[i]
		}
		sor.SortingName(names, n);

	}

}
