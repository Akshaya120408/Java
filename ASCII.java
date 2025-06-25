ASCII TO CHAR AND VICE VERSA :

package javaproject;

import java.util.Scanner;

public class ascivalue {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char a = sc.next().charAt(0);
		int b = (int)a;
		int c = sc.nextInt();
		char d = (char)c;
		System.out.println("CHAR TO ASCII :"+b);
		System.out.println("ASCII TO CHAR :"+d);
	}
}

