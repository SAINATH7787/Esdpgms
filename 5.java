// finding square root
import java.lang.Math;
import java.util.Scanner;
class squrt{
	public static void main(String []args){
	int a;	
	Scanner ob = new Scanner(System.in);
	System.out.printf("Enter any number\n");
	a=ob.nextInt();
	System.out.println("the square root of given number is "+Math.sqrt(a));	
	}
}