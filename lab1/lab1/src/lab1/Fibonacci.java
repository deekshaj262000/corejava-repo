package lab1;

import java.util.Scanner;

public class Fibonacci {

	private static Scanner sc;

	public static void main(String[] args) {
	
		int a=0,b=1;
		sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n =sc.nextInt();
		System.out.println(a+" " +b);
		int c;
		for(int i = 1;i<=n;i++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}

	}

}
