package Assignments;
import java.util.Scanner;
public class Assignment4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int bluebird = 50;
		int x = sc.nextInt();
		int numberofpeoples = 50 * (x/50);
		System.out.println("Number of people trvelling today:" + numberofpeoples);
	}

}
