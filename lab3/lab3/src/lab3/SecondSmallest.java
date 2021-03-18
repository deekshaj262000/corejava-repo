package lab3;
import java.util.*;

public class SecondSmallest {
	public static int getSecondSmallest(Integer[] a,int total) {
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		int element=list.get(1);
		
		return element;
	}

	public static void main(String[] args) {
		Integer[] a= {1,2,5,6,3,2};
		Integer[] b= {44,66,99,77,33,22,55};
		System.out.println("second smallest:"+getSecondSmallest(a,6));
		System.out.println("second smallest:"+getSecondSmallest(b,7));
		
		
		

	}

}
