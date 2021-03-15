package lab1;
import java.util.*;

public class PrimeNumbers {

	private static Scanner console;

	public static void main(String[] args) {
		int n;
		int p = 0;
		System.out.println("enter a number");
		console = new Scanner(System.in);
		
		 n=Integer.parseInt(console.nextLine());
		for(int i=1;i<n;i++)
		{
			
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
					p=p+1;
			}
			if(p==0)
				System.out.println(i);
			else
				p=0;
		}

	}

}
