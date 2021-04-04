//given number is palindrome or not 
import java.util.Scanner;
class pali{
	public static void main(String[] args) {
		int num1,num2=0,c=0,l;
		Scanner ob = new Scanner(System.in);
		System.out.printf("enter any number\n");
		num1 = ob.nextInt();
		l=num1;
		while(num1!=0){
		c=num1%10;
		num2=c+num2;
		num1=num1/10;
		if(num1!=0)
			num2 = num2*10;
	}
	//num2=num2/10;
	//System.out.printf("num1 is %d",num1);
	if(l==num2){
	//	System.out.printf("num2 is %d",num2);
	
		System.out.printf("Given number is palindrome\n");
	}
	else{
	//	System.out.printf("num2 is %d",num2);
		System.out.printf("Given number is not palindrome\n");
	}
}
}