FOR LOOP :

1. NATURAL NUMBER :

package javaproject;

import java.util.Scanner;

public class fornatural {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for(int i =0 ; i<=n;i++) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		for(int i =n ; i>0;i--) {
			System.out.print(i+" ");
		}

		
	}
}
_______________________________________________________________________

2. ODD OR EVEN :

package javaproject;

import java.util.Scanner;

public class forodd {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("Odd Ascending");
		for(int i =1 ; i<=n;i=i+2) {
			System.out.print(i+" ");

		}
		System.out.println(" ");
		System.out.println("Even Ascending");
		for(int i =0; i<n;i=i+2) {
			System.out.print(i+" ");

		}

	}
}

______________________________________________________________________

3. FACTORIAL:

package javaproject;

import java.util.Scanner;
	
public class forfact {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int fact = 1;
		for(int i = 2 ;i<=n;i++) {
			fact *=i;
		}
		System.out.println(fact);
	}
}

____________________________________________________________________

4.SUM OF EVEN :
  
package javaproject;

import java.util.Scanner;

public class sumofeven {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i =0; i<n;i=i+2) {
			sum+=i;
		}
		System.out.println(sum);
	}	
}

_______________________________________________________________

5. MULTIPLICATION TABLES :
  
package javaproject;

import java.util.Scanner;

public class fortables {
	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		int n = sc.nextInt();
		for(int i = 1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+i*n);
		}
	}
}

___________________________________________________________

6.FIBONOIC SERIES :

package javaproject;

import java.util.Scanner;

public class forfibonoic {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int first =0,second = 1;
		for(int i = 2; i<=n;i++) {
			System.out.print(first+" ");
			int third = first+second;
			first = second;
			second = third ;
		}
	}
}

_____________________________________________________________


7. PALINDROM NUMBER:

package javaproject;

import java.util.Scanner;

public class forpalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while(num!=0) {
			int d = num%10;
			rev = rev*10+d;
			num/=10;
		}
		if(temp == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome ");
		}
	}
}

__________________________________________________________________

8.PALINDROME STRING :

	package javaproject;
	
	import java.util.Scanner;
	
	public class forpalindromestring {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			String s1= s;
			String rev = " ";
			int n = s.length();
			for(int i =n-1;i>=0;i--) {
				rev+=s.charAt(i);
			}
			if(s1.equals(rev)) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not Palindrome ");
			}
		}
	}

_________________________________________________________________
  
WHILE LOOP :	

9. NUMBER TILL N :

package javaproject;

import java.util.Scanner;

public class whiletill {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0 ;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}
}
___________________________________________________________

10.COUNT DIGIT :
  
package javaproject;

import java.util.Scanner;

public class whilecountdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		n = Math.abs(n);
		if(n == 0) count =1;
		else {
			while(n>0) {
				n = n/10;
				count++;
			}
		}
		System.out.println(count);
	}
}
_________________________________________________

11.GCD :

package javaproject;

import java.util.Scanner;

public class WHILEGCD {
	public static void main(String[] args ) {
		Scanner sc = new Scanner (System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
n1 = Math.abs(n1);
		n2 = Math.abs(n2);
		while(n2!=0) {
			int temp = n2;
			n2 = n1%n2;
			n1 = temp;
		}
		System.out.println(n1);
	}
}

________________________________________________________

DO WHILE :

12. NUMBER TILL N :

package javaproject;

import java.util.Scanner;

public class dotill {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
}
}
______________________________________________________

13.EVEN NUMBER :

package javaproject;

import java.util.Scanner;

public class doeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int i = 0;
		do {
			System.out.println(i);
			i+=2;
		}while(i<=n);
		System.out.println("DESCENDING");
		int j = n;
		do {
			System.out.println(j);
			j-=2;
		}while(j>=0);                  
  }                     
}

