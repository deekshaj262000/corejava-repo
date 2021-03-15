package lab1;
import java.util.*;
import java.io.*;
public class CubeNum {
	public static void main(String[] args) {
	 int number=0;
	 int sum=0;
     System.out.println("enter a number");
     Scanner console=new Scanner(System.in);
     number=Integer.parseInt(console.nextLine());
     int counter=0;
     while(number>0) {
    	 int t=number%10;
    	 System.out.println("cube of"+t+"is"+(t*t*t));
    	 sum=sum+(t*t*t);
    	 counter=counter+1;
    	 number=number/10;
     }
     System.out.println("sum"+sum);
}

}
