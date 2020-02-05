/**
 *  Author: MazzyK
 *  Description: A java implementation to find whether a given integer is a palindrome of itself
 */

package leetcode;

import java.util.Scanner;

public class reverseint {

	public static int getNum() {
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Enter an integer");
			int num = kb.nextInt();
			return num;
		}
	}
	public static int reverse(int x) {
		
		int length = String.valueOf(x).length();
		int[] digits = new int[length];
		long tmp=0;
		int rev=0;
		int i=0;
		boolean isNeg = false;
		boolean MaxInt = false;
		
		
		if (x<0) {
			isNeg=true;
			x=x*(-1);
			length = length -1;
		}
		while(x > 0) {
			digits[i]= x % 10;
		    x = x / 10;
		    i++; 
		}
		
		
		for(i = 0; i < length; i++) {
			tmp += Math.pow(10,i) * digits[length - i - 1];
			if(tmp>Integer.MAX_VALUE) {
				MaxInt=true;
			}else {
				rev=(int)(tmp);
			}
		}
		
		
		
		if (isNeg==true) {
			rev=rev*(-1);
		}
		if(MaxInt==true) {
			rev=0;
		}
		
		return rev;
    }
	
	public static void main(String[] args) {
		int number = getNum();
		System.out.println(reverse(number));

	}

}
