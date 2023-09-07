//The following even sized array shows on and off times of an electric vehicle on a
//particular day in 24 hour format: (850 means 8:50AM, 1330 means 1:30PM)
//int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
//Calculate the running time of the electric vehicle. Expected output: 1 hr 50 min
package Assignment3;
public class Ques4 {
     public static void main(String args[]) {
    	   int[] ev = {850, 945, 1145, 1155, 1230, 1245, 1330, 1340, 1425, 1445};
    	   int totalTime = 0;
           for (int i = 0; i < ev.length; i += 2) {
               int onTime = ev[i];
               int offTime = ev[i + 1];
               int onHours = onTime / 100;
               int onMinutes = onTime % 100;
               int offHours = offTime / 100;
               int offMinutes = offTime % 100;
               int elapsedHours = offHours - onHours;
               int elapsedMinutes = offMinutes - onMinutes;
               totalTime += (elapsedHours * 60 + elapsedMinutes);
           }
           int hours = totalTime / 60;
           int minutes = totalTime % 60;
           System.out.println("Running Time: " + hours + " hr " + minutes + " min");
       }
}
   
 
 