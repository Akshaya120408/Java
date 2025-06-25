1.FIND BYTES :

package javaproject;

public class findbyte {
	public static void main(String[] args) {
		System.out.println("Byte :"+Byte.BYTES);
		System.out.println("Short :"+Short.BYTES);
		System.out.println("Int :"+Integer.BYTES);
		System.out.println("Long :"+Long.BYTES);
		System.out.println("Float :"+Float.BYTES);
		System.out.println("Double :"+Double.BYTES);
		System.out.println("Character :"+Character.BYTES);
		
	}
}
__________________________________________________________________

2. EVEN OR ODD USING THE BITWISE OPERATOR :

package javaproject;

import java.util.Scanner;
	
public class evenusingbitwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if((a & 1) ==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");

		}
				
	}
}


