/*program to compute body mass index.*/
import java.util.Scanner;
class BMI{
	public static void main(String args[]){
		double weight,height;
		System.out.printf("Enter Weight(in kgs) and height(in meters)\n");
		Scanner ob = new Scanner(System.in);
		weight= ob.nextInt();
		height= ob.nextInt();
		double bmi = weight/(height * height);
		System.out.println("BMI : "+bmi);
	}
}