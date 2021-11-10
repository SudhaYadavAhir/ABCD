package com.evs.automation;

public class Asdfgh {

	public static void main(String[] args) {
   ertyu();
		
		
	}
	
	
	public static void charCount() {
		int temp;int j;
		int[] num = { 10, 10, 20, 21, 20, 30, 30, 21, 12 };
		for (int i = 0; i < num.length; i++) {
			temp = 1;
			for( j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					temp++;
					num[i] = '@';

				}
				
			}
			if (temp>1 && num[j]!='@') {
				System.out.println(num[i]+" is repeated "+ temp+" times");	

			}
		}	
	}
	
	
	public static void m1() {
		
	    String test = "Saksoft_software";
	
	String[] asdf=test.split("_");
	for (int i = 0; i < asdf.length; i++) {
	System.out.println(asdf[1]);		
	}
	System.out.println(test.substring(test.indexOf("_"), test.length()));
	
	System.out.println( test.substring(test.indexOf(test.charAt(6))+1, test.length()));
	  

	}
	
	public static void ertyu() {
		int a=23;
		int b=23;
		int c=12;
		int d=12;
		System.out.println(a+b+"asdf"+c+d);
	}

}
