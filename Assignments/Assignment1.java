package Assignments;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int millisecound = sc.nextInt();
		
		int Hr = millisecound / 3600000;
		int M = (millisecound / 60000) % 60;
		int S = (millisecound / 1000) % 60;
	
		System.out.print(Hr +":" + M + ":" + S );
		

	}

}
