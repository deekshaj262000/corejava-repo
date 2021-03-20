/**
 * Name:Chinmayi J
 * Description: program to display the difference in days,months and year 
 * Date :19/03/21
  */



package lab4;
import java.time.*;

public class SystemDate {

	public static void main(String[] args) {
		 LocalDate pdate = LocalDate.of(2019, 03, 16);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.println("Difference in year is: "+diff.getYears()+ " Years " +diff.getMonths()+ " months " +diff.getDays()+ " days");
	  }

	}


