/*18. Find the power of the number without using existing methods. */

class Power{
	public static void main(String args[]){
		int power = 10;
		int base = 4;
		int temp = base;
		while(power > 1){
			temp = temp * base;
			//System.out.println(temp);
			power--;
		}
		System.out.println("Ans : " + temp);
	}
}