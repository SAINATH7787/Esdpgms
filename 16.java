import java.util.Scanner;  
class disc  { 	 
	public static void main(String[] Strings)   
{  
	Scanner input = new Scanner(System.in);  
	System.out.printf("enter the co efficients of quadractic equation\n");
	System.out.print("Enter the value of a: ");  
	double a = input.nextDouble();  
	System.out.print("Enter the value of b: ");  
	double b = input.nextDouble();  
	System.out.print("Enter the value of c: ");  
	double c = input.nextDouble();  
	double d= b * b - 4.0 * a * c;
	System.out.println(Math.sqrt(d));  
}}
