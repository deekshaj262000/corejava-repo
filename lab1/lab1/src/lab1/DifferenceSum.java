package lab1;
import java.util.Scanner;

public class DifferenceSum {

	private static Scanner sc;
	public static void main(String[] args) {
sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int range=sc.nextInt();
        System.out.println("The difference is:"+calculateDifference(range));
	}
    private static int calculateDifference(int n)
    {
    	int sum=0;
    	int sumOfN=0,sumOfSquares=0;
    	sumOfN=(n*(n+1)/2);
    	sumOfSquares=((n*(n+1)*(2*n+1))/6);
    	sum=(sumOfN*sumOfN)-sumOfSquares;
    	return sum;
    }

	}


