/*Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).*/
import java.util.Scanner;
class Speed{
	public static void main(String args[]){
		double totalSec,mps,kmph,mph,distance;
		int sec,min,hour;
		System.out.printf("enter distance(in meters)\n");
		Scanner ob = new Scanner(System.in);
		distance = ob.nextInt();
		//distance = 400; // in meters
		System.out.printf("enter time in hr:min:sec format \n");
		
		hour = ob.nextInt();
		min= ob.nextInt();
		sec = ob.nextInt();/*int sec = 50;
		int min = 34;
		int hour = 1;*/
		
	   	totalSec= (double)(sec + (min * 60) + ( hour * 60 * 60));
	    mps = distance/ totalSec;
		kmph = 3.6 * mps;
		mph = 2.23694 * mps;
		
		System.out.println("mps :"+mps+"\nkmph : "+kmph+"\nmph : "+mph); 
		
	}
}