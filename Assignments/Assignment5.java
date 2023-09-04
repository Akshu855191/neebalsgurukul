package Assignments;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		   int n1 = sc.nextInt();
		   int n2 = sc.nextInt();
		   int n3 = sc.nextInt();
		   int z = n1>n2?n1:n2;
		   int x = n3>z?z:n3;
		   System.out.println(z);
		   

	}

}