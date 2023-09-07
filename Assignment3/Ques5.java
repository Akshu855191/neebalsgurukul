//Write a program to input an array from the user and find the index of the smallest element
//in the array.
package Assignment3;
import java.util.Scanner;
public class Ques5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Length of array is :" + n);
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int minindex = 0;
		for(int i = 1; i < n; i++) {
			if(a[i] < a[minindex]) {
				minindex=i;
				
			}
	}
		System.out.println("Index of the smallest element :" +minindex);
		
	}

}
