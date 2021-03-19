package lab1;
import java.util.*;

public class SumNatural {

	private static Scanner sc;
	public static void main(String[] args) {
       sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int range=sc.nextInt();
		System.out.println("The sum of natural number upto "+range+" is:"+calculateSum(range));
		

	}
	private static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				sum+=i;
			}
		}
		return sum;
	}

	}


