package com.evs.coding;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// duplicateChr("hellolo");
		// duplicateWord("Ram is a good boy ram is indian");
		// reverseInSameOrder("this is sudha I am good");
		// qwe();
		// asd();
		// onlyPrintCharacter();
		// max();
		// min();
		// esd();
		// table();
		table2();

	}

	public static void duplicateChr(String str) {
		int count;
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					c[j] = '#';
				}
			}
			if (count > 1 && c[i] != '#') {
				System.out.println(c[i] + "--" + count);
			}
		}
	}

	public static void duplicateWord(String sentence) {
		String[] word = sentence.split(" ");
		int count;
		for (int i = 0; i < word.length; i++) {
			count = 1;
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].contains(word[j])) {
					count++;
					word[j] = "@";
				}

			}
			if (count > 1 && word[i] != "@") {
				System.out.println(word[i] + " is repeated " + count + " times");
			}
		}
	}

	public static void reverseInSameOrder(String sentence) {
		String rev;
		String[] word = sentence.split(" ");

		for (int j = 0; j < word.length; j++) {
			rev = " " + word[j];
			for (int i = rev.length() - 1; i >= 0; i--) {
				System.out.print(rev.charAt(i));
			}
		}
		System.out.println();

	}

	public static void qwe() {
		for (int i = 0; i < 3; i++) {
			for (int j = i; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void asd() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void max() {
		String str = "12,345,5,35,69";
		String[] num = str.split(",");
		int IntArr[] = new int[num.length], z = 0, max = 0;
		for (String j : num) {
			IntArr[z] = Integer.parseInt(j);
			z++;
		}

		for (int i = 0; i < IntArr.length; i++) {
			if (max < IntArr[i]) {
				max = IntArr[i];

			}
		}
		System.out.println(max);
	}

	public static void onlyPrintCharacter() {
		String str = "This@ is# sudha$ she% is^ good&";
		String strSpl = str.replaceAll("\\W", " ");
		System.out.print(strSpl);

	}

	public static void min() {
		String str = "12,345,5,35,69";
		String[] StringArr = str.split(",");
		int num = 0, min;
		int[] intArr = new int[StringArr.length];
		for (String x : StringArr) {
			intArr[num] = Integer.parseInt(x);
			num++;
		}
		min = intArr[0];
		for (int i = 0; i < intArr.length; i++) {
			if (min > intArr[i]) {
				min = intArr[i];
			}
		}
		System.out.println(min);
	}

	public static void esd() {
		String str = "12,45,5,35,69";
		String[] stringArr = str.split(",");
		int a = 0, s = 0;
		int[] intArry = new int[stringArr.length];
		for (String i : stringArr) {
			intArry[a] = Integer.parseInt(i);
			a++;
		}
//		for (int i = 0; i < stringArr.length; i++) {
//			intArry[i]=Integer.parseInt(stringArr[i]);
//		}
		int i;
		for (i = 0; i < intArry.length; i++) {
			for (int j = i + 1; j < intArry.length; j++) {
				if (intArry[i] > intArry[j]) {
					s = intArry[i];
					intArry[i] = intArry[j];
					intArry[j] = s;
					System.out.print(intArry[i] + ", ");
				}

			}
		}

//		for (int i = 0; i < intArry.length; i++) {
//			System.out.print(intArry[i]+", ");
//		}

	}

	public static void table() {
		System.out.println("What is your name");
		Scanner scrn = new Scanner(System.in);
		String name = scrn.nextLine();
		int table;
		if (name.equalsIgnoreCase(name)) {
			System.out.println("Welcome " + name);
		} else if (name.equalsIgnoreCase("")) {
			System.out.println("please enter any name");
		}
		System.out.println("you want to write any table");
		int num = scrn.nextInt();
		for (int i = 1; i <= 10; i++) {
			table = num * i;
			System.out.println(num + "*" + i + "=" + table);
		}
		System.out.println("you want to write any other table(Y/N)");
		if (name.equalsIgnoreCase("Y")) {
			System.out.println("What is your name");
			if (name.equalsIgnoreCase("sudha")) {
				System.out.println("Welcome " + name);
			} else if (name.equalsIgnoreCase("")) {
				System.out.println("please enter any name");
			}
			System.out.println("you want to write any table");
			for (int i = 1; i <= 10; i++) {
				table = num * i;
				System.out.println(num + "*" + i + "=" + table);
			}
		} else if (name.equalsIgnoreCase("N")) {
			System.out.println("Good bye  " + name);

		}
	}

	public static void table2() {
		System.out.println("What is your name");
		Scanner scrn = new Scanner(System.in);
		String name = scrn.nextLine();
		int table;
		int j = 0;
		while (j >= 0) {
			if (name.equalsIgnoreCase(name)) {
				System.out.println("Welcome " + name);
			} else if (name.equalsIgnoreCase("")) {
				System.out.println("please enter any name");
			}
			System.out.println("you want to write any table");
			int num = scrn.nextInt();
			for (int i = 1; i <= 10; i++) {
				table = num * i;
				System.out.println(num + "*" + i + "=" + table);
			}
			System.out.println("you want to write any other table(Y/N)");

			do {
				if (name.equalsIgnoreCase("n")) {
					System.out.println("Good bye  " + name);
				}
				j--;
			} while (name.equalsIgnoreCase("y"));
		}

	}
}
