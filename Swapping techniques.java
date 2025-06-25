1.SWAPING OF 2 VALUES WITH 3rd VARIABLE :

package javaproject;

import java.util.Scanner;

public class swapwithtemp {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" " +b);
		
	}
}
__________________________________________________________________
  
2.SWAPING OF 2 VALUES WITH 3rd VARIABLE :
  
package javaproject;

import java.util.Scanner;

public class swapwithoutvaar {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" " +b);
		
	}
}
_________________________________________________________________________

7.SWAPING OF 2 VALUES WITH BITWISE OPERATOR :
  
package javaproject;

import java.util.Scanner;

public class swapwithbitwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" " +b);
		
	}
}
