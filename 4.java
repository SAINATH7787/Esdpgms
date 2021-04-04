// to find square of number
import java.util.Scanner;
class sq{
	public static void main(String []args){
		Scanner ob=new Scanner(System.in);
		int i,s;
		System.out.println("enter a Number\n");
		i=ob.nextInt();
		s=i*i;
		System.out.println("the square of the given number :"+s);
	}
}