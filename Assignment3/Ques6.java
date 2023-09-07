//The following arrays shows the profits of a company from 2001 to 2010:
//int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
//Write a program to find which year the decline in profits began.

package Assignment3;
public class Ques6 {
	public static void main(String args[]) {
		        int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
		        int startYear = -1;
		        for (int i = 1; i < profits.length; i++) {
		        	if (profits[i] <= profits[i - 1]) {
		                startYear = i;
		                break;
		            }
		        }

		        if (startYear != -1) {
		            System.out.println("The decline in profits began in the year " + (2001 + startYear));
		        } else {
		            System.out.println("There was no decline in profits during this period.");
		        }
		    }
}
	
