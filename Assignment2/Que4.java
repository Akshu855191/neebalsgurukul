////Print first 10 even fibonacii numbers
 
package Assignment2;
import java.util.Scanner;
public class Que4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number :");
		int n = sc.nextInt();
		System.out.println("Fibonecci Series of first 10 even Numbers are :");
		int first=0;
		int second=1;
		System.out.println(first+" \n"+second);
		for(int i=0;i<n-2;) {
			int third=first+second;
		   if(third%2==0) {
				System.out.println(third);
				i++;
				}
			first=second;
			second=third;
			}
		}
	}