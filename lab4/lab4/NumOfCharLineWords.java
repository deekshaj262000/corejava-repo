/**
 * Name:Chinmayi J
 * Description: program to display the number of characters,lines,words.
 * Date :19/03/21
  */

package lab4;
public class NumOfCharLineWords {

	public static void main(String[] args) {
		String str=" My name is Chinmayi\n";
		int cc=0,cw=0,cl=1;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='\n') {
				cl++;
			}
			else if (str.charAt(i) ==' ') {
				cw++;
			}
			else if (str.charAt(i)!=' ') {
				cc++;
			}
		}
		 System.out.println("\nNumber of lines : "+cl);
         System.out.println("\nNumber of words : "+cw);
         System.out.println("\nNumber of characters : "+cc);
	}



	}


	


