/**
 * Name:Chinmayi J
 * Description: program to create a mirror image of a string.
 * Date :18/03/21
  */



package lab4;
import java.util.Scanner;

public class Mirror {

	private static Scanner sc;
	public static void main(String[] args) {
sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println(getImage(str));
	    
	}
    private static String getImage(String pStr)
    {
    	
    	StringBuffer reverseStr=new  StringBuffer(pStr);
    	reverseStr.reverse();
    	return pStr+"|"+reverseStr;
    
    }


	}


