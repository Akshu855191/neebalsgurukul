//The following array contains attendance data of a student:
//int[] arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
//Write a program to find the attendance percentage of this student.

package Assignment3;
public class Que2 {
	public static void main(String[] args) {
	    int[] arr = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1};
	    int total = arr.length;
        int Count = 0;
        for (int attendance : arr) {
        	if (attendance == 1) {
                Count++;
            }
        }
        double attendancePercentage = (double) Count / total * 100;
        System.out.println(total);
        System.out.println(Count);
        System.out.println( attendancePercentage + "%");
    }

	}

