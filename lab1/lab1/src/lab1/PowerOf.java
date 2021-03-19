package lab1;
import java.util.*;

public class PowerOf {

	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
   System.out.println(checkNumber(number));
}
public static  boolean checkNumber(int n)
{
	boolean status=false;
	int i=1,mul=1;
	while(i>0)
	{
		mul*=2;
		if(mul==n)
		{
			status=true;
			break;
		}
		else if(mul>n)
			break;
		i++;
	}
    
	return status;
}




	}


