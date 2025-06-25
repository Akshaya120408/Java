1.GREATER NUMBER :
package javaproject;

import java.util.Scanner;

public class congreater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println("A is greater");
		}
		else {
			System.out.println("B is greater");
		}
	}
}

_______________________________________________________________

2.POSITIVE OR NEGATIVE :

package javaproject;

import java.util.Scanner;

public class conpositiveorneg {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("A is a positive number.");
		}
		else {
			System.out.println("A is negative number.");
		}
	}
}
_____________________________________________________________________

3.EVEN OR ODD :

package javaproject;

import java.util.Scanner;

public class conoddeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("A is a even number.");
		}
		else {
			System.out.println("A is odd number.");
		}
	}
}

_______________________________________________________________

4.MULTIPLES OF 3 AND 2 :

package javaproject;

import java.util.Scanner;

public class conmul {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a%2==0 && a%3==0) {
			System.out.println("A is divisible by 2 and 3.");
		}
		else {
			System.out.println("A is not divisible by 2 and 3.");
		}
	}
}
_________________________________________________________________________

5. 3 DIGIT NUMBER OR NOT :

package javaproject;

import java.util.Scanner;

public class con3dig {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a>99 && a<1000) {
			System.out.println("A is 3 digit number.");
		}
		else {
			System.out.println("A is not 3 digit number.");
		}
	}
}

_______________________________________________________________________________

 ELSE IF :

6.WHICH IS GREATER AMONG 3:

package javaproject;

import java.util.Scanner;

public class elseifgreater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a>b && a>c) {
			System.out.println("A is greater");
		}
		else if(b>c && b>a){
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
	}

}
________________________________________________________________________

7.POSITIVE , NEGATIVE OR ZERO :
package javaproject;

import java.util.Scanner;

public class elseifposneg0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("A is a positive number.");
		}
		else if(a<0) {
			System.out.println("A is negative number.");
		}
		else {
			System.out.println("A is Zero");
		}
	}
}
________________________________________________________________________________

NESTED IF :
  
8.HEIGTH AND AGE VERIFICATION :
  
package javaproject;

import java.util.Scanner;

public class nestedif {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter age :");
		int age = sc.nextInt();
		System.out.println("Enter heigth :");
		int heigth = sc.nextInt();
		if(age>=18) {
			if(heigth>=160) {
				System.out.println("Age and Height is enough");
			}
			else {
				System.out.println("Height is not enough");
			}
		}
		else {
			System.out.println("Age is not enough");
		}
	}
}

___________________________________________________________________________


SWITCH CASE :

9.FIND THE DAY :

package javaproject;

import java.util.Scanner;

public class switchdays {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int  day = sc.nextInt();
		switch(day) {
		case 1:
		{
			System.out.println("Sunday");
			break;
		}
		case 2:
		{
			System.out.println("Monday");
			break;
		}
		case 3:
		{
			System.out.println("Tuesday");
			break;
		}
		case 4:
		{
			System.out.println("Wednesday");
			break;
		}
		case 5:
		{
			System.out.println("Thursday");
			break;
		}
		case 6:
		{
			System.out.println("Friday");
			break;
		}
		case 7:
		{
			System.out.println("Saturday");
			break;
		}
		default:{
			System.out.println("Enter the valid input .");
			break;

		}

		}
	}
}
_____________________________________________________________________________
  
10.FIND THE MONTH :

package javaproject;

import java.util.Scanner;

public class switchmonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String  month = sc.next();
		switch(month) {
		case "January":
		{
			System.out.println("Its January . It has 31 days.");
			break;
		}
		case "February":
		{
			System.out.println("Its February . It has 28 or 29 days.");
			break;
		}
		case "March":
		{
			System.out.println("Its March . It has 31 days.");
			break;
		}
		case "April":
		{
			System.out.println("Its April . It has 30 days.");
			break;

		}
		case "May":
		{
			System.out.println("Its May . It has 31 days.");
			break;

		}
		case "June":
		{
			System.out.println("Its June . It has 30 days.");
			break;

		}
		case "July":
		{
			System.out.println("Its July . It has 31 days.");
			break;

		}
		case "August":
		{
			System.out.println("Its August . It has 31 days.");
			break;

		}
		case "September":
		{
			System.out.println("Its September . It has 30 days.");
			break;

		}
		case "October":
		{
			System.out.println("Its October . It has 31 days.");
			break;

		}
		case "November":
		{
			System.out.println("Its november . It has 30 days.");
			break;

		}
		case "December":
		{
			System.out.println("Its December . It has 31 days.");
			break;

		}
		default:
		{
			System.out.println("Enter the valid input");
			break;
		}

		}
	}
}
_______________________________________________________________________________________

11. WRITE THE PROGRAM TO CALCULATE THE EB BILL;
	 
FOR 1st  50 UNITS : Rs 0.50 / UNIT  -----> ( 0-50 UNITS)

FOR NEXT  100 UNITS : Rs 0.75 / UNIT  -----> ( 51-150 UNITS)

FOR NEXT  100 UNITS : Rs 1.20 / UNIT  -----> ( 151-250 UNITS)

FOR NEXT  100 UNITS : Rs 1.50 / UNIT  -----> ( Above 250 UNITS)





package javaproject;

import java.util.Scanner;

public class switcheb {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int unit = sc.nextInt();
		float bill =0;
		if(unit >0 && unit <=50) {
			bill = unit*0.50f;
		}
		else if(unit>50 && unit <=150) {
			bill = 50*0.50f + (unit-50)*0.75f;
		}
		else if(unit>150 && unit<=250) {
			bill = 50*0.50f + 100*0.75f+(unit - 150)*1.20f;
		}
		else {
			bill = 50*0.50f + 100*0.75f+100*1.20f+(unit - 250)*1.50f;
		}
		bill += bill*0.2f;
		System.out.println("FINAL BILL : "+bill);
	}
}


