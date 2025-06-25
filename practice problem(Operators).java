1.TEMPERATURE :

package javaproject;

import java.util.Scanner;

public class temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float cel = sc.nextFloat();
		float fah =  (cel*9/5)+32;
		System.out.println(fah);
		
	}
}
____________________________________________________________________________________________
2.AREA  AND PERIMETER OF THE RECTANGLE :

package javaproject;

import java.util.Scanner;

public class area {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("Area :"+(a*b));
		System.out.println("Perimeter :"+2*(a+b));
}
}


