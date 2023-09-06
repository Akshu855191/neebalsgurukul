/*
 Input the lower bound and upper bound then print all the Fibonacci numbers
 within the bound Test case : Input lower =5 and upper= 40 Output: 5 8 13 21 34
*/
package Assignment2;
import java.util.Scanner;
public class Que3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lower Bound");
		int lower = sc.nextInt();
		System.out.println("Enter Upper Bound");
		int upper = sc.nextInt();

		if (lower > upper) {
			System.out.println("Invalid input");
		} else {
			int first = 0, second = 1, third;

			System.out.println("Fibonecci Series between " + lower + " And " + upper + " is ");

			for (third = first + second; third <= upper;) {
				if (third >= lower) {
					System.out.println(third + "  ");
				}
				first = second;
				second = third;
				third = first + second;
			}

		} 
	}

}

		
