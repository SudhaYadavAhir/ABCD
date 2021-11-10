package com.evs.coding;

import java.util.Scanner;

public class DoWhileEg {

	public static void table(int tbl) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(tbl+"x"+i+" = "+i*tbl);
		}
	}
	public static void main(String[] args) {
String y_n=  "";int tbl; 
Scanner scn=new Scanner(System.in);
System.out.println("What is your name");
String name=scn.next();
if (name.equalsIgnoreCase(name)) {
	System.out.println("Welcome "+ name);
}
//Scanner obj_yn=new Scanner(System.in);

do {
	System.out.println("Please Enter a number to print a table : ");

	tbl= scn.nextInt();
	table(tbl);
	System.out.println("Do you want to continue...? (yes/no)");
	y_n=scn.next();
} while (y_n.equals("yes"));
System.out.println("Good Bye !!!");
	}
	

}
