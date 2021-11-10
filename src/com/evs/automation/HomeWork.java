package com.evs.automation;

public class HomeWork {

	public static void main(String[] args) {
//		printElements(new String[] { "Asha", "Prity", "Madhu", "Guddan", "Sudha" });
//		printElementInReverce(new String[] { "Asha", "Prity", "Madhu", "Guddan", "Sudha" });
//		printOddElement(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
//		printEvenElement(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		//printLargestElement(new int[] { 12, 34, 13, 2, 4, 54, 21, 8, 9 });
		// printSmallestElement(new int[] { 12, 34, 13, 2, 4, 54, 21, 8, 9 });
		// sumAllElement(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		copyElementOtherArray();
	}

	public static void printElements(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static void printElementInReverce(String[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i]);
		}
	}

	public static void printOddElement(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.println(num[i]);
			}
		}
	}

	public static void printEvenElement(int[] num) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}
	}

	public static void printLargestElement(int[] num) {
		int i, max = num[0];
		for (i = 0; i < num.length; i++) {

			if (max < num[i]) {

				max = num[i];

			}
		}
		System.out.println(max);
	}

	public static void printSmallestElement(int[] num) {
		int i;
		int min = num[0];
		for (i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println(min);
	}

	public static void sumAllElement(int[] num) {
		int i, sum = 0;
		for (i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);

	}
	
	public static void copyElementOtherArray() {
		int[] arr1= {12,23,34,45,56,67,78,89,90};
		int[] arr2 =new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i]=arr1[i];
			System.out.print(arr2[i]+", ");
		}
	}

}
