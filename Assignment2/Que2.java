/*
Write a program to accept a coordinate point in a XY coordinate system and
determine in which quadrant the coordinate point lies. Test Case: Input : x=0
y=5 Output : Y axis Input : x=5 y=5 Output : Ist Quadrant
*/
			
package Assignment2;
import java.util.Scanner;
public class Que2 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter x co-ordinate");
			int x=sc.nextInt();
			System.out.println("Pleasae enter y co-ordinate");
			int y=sc.nextInt();
			
			if(x>0&&y>0) {
				System.out.println("I Quadrant");
			}
			else if(x>0&&y<0) {
				System.out.println("II Quadrant");
			}
			else if(x<0&&y<0) {
				System.out.println("III Quadrant");
			}
			else if(x<0&&y>0) {
				System.out.println("IV Quadrant");
			}
			else if(y==0&&x>0) {
				System.out.println("X Axis");
			}
			else if(x==0&&y>0) {
				System.out.println("Y Axis");
			}
			else if(y==0&&x<0) {
				System.out.println("x Axis");
			}
			else if(x==0&&y<0) {
				System.out.println("y Axis");
			}
		}
	}


