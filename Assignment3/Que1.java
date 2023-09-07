//Write a program to input an array from the user and reverse the order of elements in an
//array in place i.e. without using any additional arrays.

package Assignment3;
import java.util.Scanner;
public class Que1 {
	public static void main(String args[]) {
		  
		Scanner sc=new Scanner(System.in);  
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("This is an length of array :" + n);

		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array reverse element");
		for(int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}
		
	
	}  
}
