// Q.1 Write a program to calculate Cosine series

package Assignment2;
import java.util.Scanner;
public class Ques1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Pleases enter the number");
        int n=sc.nextInt();   
        double x=Math.toRadians(n); 
        double sum=1; 
        int fact=1;  
        double num=1; 
        
        for(int i=1;i<=n;i++) {
        	fact=fact*i; 
        	if(i%2==0) {
        		num=-num*x*x;
        		sum=sum+num/fact;
        	}
        }
        System.out.println("Calculated Cosine Series is: "+sum);
	}

}
	
