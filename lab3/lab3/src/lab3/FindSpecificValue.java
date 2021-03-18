package lab3;

public class FindSpecificValue {

	public static void main(String[] args) {
		int[]  userInput= {1,4,5,6,7,20};
		int specificElement=7;
		FindSpecificValue.getSpecificValue(userInput,specificElement);
		
		

	}
	public static void getSpecificValue(int[] userInput,int specificElement){
		int[] input=userInput;
		int element=specificElement;
		for(int i=0;i<input.length;i++) {
			System.out.println(" " +input[i]);
			if(input[i]==element) {
				System.out.println("yes");
			}
		}
	}

}
