package Assignments;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
		  int m,year,weeks,day,month;
		  m = sc.nextInt();
		  year = m / 365;
		  m = m % 365;
		
          month = m / 30;
		  m = m - (month*30);
		  weeks = m / 7;
		  
		  day= m - (weeks*7);
//
//		  
//		  
		  System.out.println(year + " year " + month + " month " + weeks + " week " + day + "day");
		 
		 }
		

	}

