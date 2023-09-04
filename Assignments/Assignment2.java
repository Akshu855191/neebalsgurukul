package Assignments;
import java.util.Scanner;
public class Assignment2{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		int first = n / 100;
		int secound = n % 100;
		System.out.println((secound * 100) + n);
		
		
	}
}
