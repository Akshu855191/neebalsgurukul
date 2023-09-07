//Q.3
package Assignment3;
public class Que3 {
	public static void main(String args[]) {
		 int[] monthlySales = {125000, 93000, 80000, 75000, 84000, 110000,

		            105000, 120000, 90000, 115000, 123000, 150000

		        };
		 int[] quarterlySales = new int[3];{
			 for (int i = 0; i < 3; i++) {
		 }
			 for (int j = 0; j < 4; j++) {
				 quarterlySales[i] += monthlySales[i * 4 + j];
				 }
			 }
		 System.out.println("Monthly Sales:");
		 String[] monthNames = {
				 "January", "February", "March", "April",
				 "May", "June", "July", "August",
				 "September", "October", "November", "December"
				 };
		 for (int i = 0; i < 12; i++) {
			 System.out.println(monthNames[i] + " " + monthlySales[i]);
		 }
		 System.out.println("Quarterly Sales:");
		 for (int i = 0; i < 3; i++) {
			 System.out.println("Quarter " + (i + 1) + ": " + quarterlySales[i]);
			 }
		 int totalSales = 0;
		 for (int monthlySale : monthlySales) {
			 totalSales += monthlySale;
			 }
		 System.out.println("Total Sales: " + totalSales);
		    }
	}
