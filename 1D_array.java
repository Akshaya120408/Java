1.ARRAY DECLARATION INITIALIZATION ACESS :

package javaproject;

import java.util.Scanner;

public class arrdecinacess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print(arr[0]);
		
	}
}
___________________________________________________________
  
2.SUM OF ELEMENTS :

package javaproject;

import java.util.Scanner;

public class arrsum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0 ;
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<n;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
__________________________________________________________

3.AVERAGE OF NUMBERS IN ARRAY :

package javaproject;

import java.util.Scanner;

public class arravg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0 ;
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum :"+sum);
		double avg = sum/n;
		System.out.println("Average :"+avg);

	}
}
______________________________________________________

4. ODD OR EVEN COUNT :

package javaproject;

import java.util.Scanner;

public class arrcounteven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int even = 0 , odd=0;
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<n;i++) {
			if(arr[i]%2==0) even ++;
			else  odd++;
		}
		System.out.println("Even :"+even);
		System.out.println("Odd :"+odd);

	}
}
______________________________________________________________________

5.MAXIMUM AND MINIMUM :

package javaproject;

import java.util.Scanner;

public class arrmain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		for(int i = 1; i<n;i++) {
			if(arr[i]<min) {
				max=arr[i];
			}
			
		}
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
	}
}
__________________________________________________________________

6.SORTING IN ASCENDING AND DESCENDING ORDER :

package javaproject;

import java.util.Scanner;

public class arrsort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<n-1;i++) {
			for(int j =i+1 ;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Ascending ....... ");

		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");

		for(int i = 0; i<n-1;i++) {
			for(int j =i+1 ;j<n;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("descending ....... ");

		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

			
	}
}
__________________________________________________________

7.REVERSE ARRAY :

package javaproject;

import java.util.Scanner;

public class arrrev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i =0;i<n/2;i++) {
			int temp = arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");              
    }         
  }           
}
_____________________________________________

8.MERGE 2 ARRAYS :

package javaproject;

import java.util.Scanner;

public class arrmerge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [] arr = new int [m];
		for(int i = 0;i<m;i++) {
			arr[i]=sc.nextInt();
		}
		int [] arr1 = new int[n];
		for(int i = 0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int [] merge = new int[m+n];
		for(int i = 0;i<m;i++) {
			merge[i]=arr[i];
		}
		for(int i = 0;i<n;i++) {
			merge[i+m]=arr1[i];
		}
		for(int i = 0;i<n+m;i++) {
			System.out.print(merge[i]+" ");
		}
	}
}
____________________________________________________
 
9.DISPLAY DUPLICATE ELEMENT :

package javaproject;

import java.util.Scanner;

public class arrduplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i =0 ; i<n-1;i++) {
			for(int j =i+1 ;j<n;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
______________________________________________________

10. COPY ARRAY :
  
package javaproject;

import java.util.Scanner;

public class arrcopy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int [] arr1 = new int[n];
		for(int i = 0;i<n;i++) {
			arr1[i]=arr[i];
		}
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
_______________________________________________

11.ROTATING LEFT BY 1 SHIFT :

package javaproject;

import java.util.Scanner;

public class arrrotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int first = arr[0];
		for(int i =0 ;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1] = first;

		for(int i =0 ;i<n;i++) {
			System.out.println(arr[i]);
		}
	
	}
}
_________________________________________________

12.ROTATING RIGTH BY 1 :

package javaproject;

import java.util.Scanner;

public class arrrotaterigth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int first = arr[n-1];

		for(int i =n-1 ;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0] = first;

		
		for(int i =0 ;i<n;i++) {
			System.out.println(arr[i]);
		}
	
	}
}
___________________________________________________
  
13. ROTATE LEFT BY K SHIFT :

package javaproject;

import java.util.Scanner;

public class arr2kthleft {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		k = k%n;
		for(int i =0;i<k;i++ ) {
			int last = arr[0];
			for(int j = 0;j<n-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[n-1]=last;
		}
		for(int i =0 ;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
_________________________________________________________________

14.ROTATE RIGTH BY K SHIFT :

package javaproject;

import java.util.Scanner;

public class arr2kthrigth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		k = k%n;
		for(int i = 0;i<k;i++) {
			int first = arr[n-1];
			for(int j = n-1 ;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=first;
		}
		for(int i =0 ;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}





