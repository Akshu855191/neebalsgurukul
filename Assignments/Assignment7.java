package Assignments;
public class Assignment7 {

	public static void main(String[] args) {
		int time = 2350;
        int hours = time / 100;
        int minutes = time % 100;
        boolean bln = (hours > 12) ? true : false;{
        	if (hours > 12) {
        		hours = hours - 12;
        	}
        	else if(hours == 0) {
        		hours = 12;
        	}
        	if(bln = true) {
        		System.out.println(hours + ":" + minutes + "PM");
        	}
        	else {
        		System.out.println(hours + ":" + minutes + "AM");
        	}
        }
	}

}
