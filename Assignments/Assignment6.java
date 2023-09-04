package Assignments;

public class Assignment6 {

	public static void main(String[] args) {
		
		int n = 150;
		int Initialnum = 0;
		int rem = 0;
		int result = 0;
		Initialnum = n;
		while(Initialnum != 0) {
			rem = Initialnum % 10;
			result += Math.pow(rem, 3);
			Initialnum /= 10;
		}
		if(result == n)
		System.out.println(n +  " Is an armstrong Number");
		else
	    System.out.println(n +  " Is not an armstrong number");

	}

}
