package lab3;
import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("orange");
		list.add("mango");
		System.out.println("contents of list : :"+list);
		String[] myArray=new String[list.size()];
		list.toArray(myArray);
		for(int i=0;i<myArray.length;i++) {
			System.out.println("element at the index"+i+" is : :" +myArray[i]);
		}
		
		
		
		
		

	}

}
