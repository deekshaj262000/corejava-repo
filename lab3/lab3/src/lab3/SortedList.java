package lab3;

import java.util.Scanner;

public class SortedList {

	private static Scanner sc;

	public static void main(String[] args) {
		6 = new Scanner(System.in);
		System.out.println("enter the number of items:");
		final int N_Items=sc.nextInt();
		System.out.println("enter the elements of array:");
		int[] a=new int[N_Items];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);

	

	}
	

}
