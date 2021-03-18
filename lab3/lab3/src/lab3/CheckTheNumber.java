package lab3;
import java.util.*;

public class CheckTheNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        System.out.println("enter 20 numbers");
        int a[]= {0,0,0,0,0};
        for(int i=1;i<=20;i++) {
        	int x=sc.nextInt();
        	if(x>0)
        		a[0]=a[0]+1;
        	if(x<0)
        		a[1]=a[1]+1;
        	if(x==0)
        		a[4]=a[4]+1;
        	if(x%2==1)
        		a[2]=a[2]+1;
        	else
        		a[3]=a[3]+1;

       }
        System.out.println("number of positive numbers:"+a[0]);
        System.out.println("number of negative numbers:"+a[1]);
        System.out.println("number of odd numbers:"+a[2]);
        System.out.println("number of even numbers:"+a[3]);
        System.out.println("number of zeros:"+a[4]);
	

	}

}
