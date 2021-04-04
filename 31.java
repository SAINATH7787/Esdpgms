//display first 10 Fermat numbers.
import java.lang.Math;
class Fer{
	public static void main(String args[]){
		int i;
		double num;
		System.out.println("the first 10 Fermat numbers :");
			for( i = 0; i < 10; i++){
			num = Math.pow(2, Math.pow(2, i)) + 1.0;
			System.out.println(num);
		}
	}
	
}