/*Number is Mersenne number or not.*/

import java.lang.Math;
import java.util.Scanner;
class Mers{
	public static void main(String args[]){
		int num; 
		System.out.printf("enter any number \n");
		Scanner ob = new Scanner(System.in);
		num = ob.nextInt();
		double temp = Math.log(num + 1)/Math.log(2);
		//System.out.println(temp);
		if( temp == (int) temp ){
			System.out.println("Mersenne number");
		}
	}
}