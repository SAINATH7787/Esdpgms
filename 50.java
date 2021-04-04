/*50. Implement a java program to find the LCD of the given numbers.*/
//tofind the LCD of fractions 8/9 and 7/3 ]
class findLCD{
	int LCD(int num1, int num2){
		int i = 1 , j = 1;
		int temp1 = num1;
		int temp2 = num2;
		
		while(num1 != num2){
			
			if(num2 > num1){
				num1 = temp1 * i;
				i++;
				//System.out.println("num1 "+num1);
				
				}
			if (num1 > num2){
				num2 = temp2 * j;
				j++;
				//System.out.println("num2 "+num2);
				}
				
			
		}
		return num2;
	}
	
	public static void main(String args[]){
		findLCD obj = new findLCD();
		int num1 = 8;
		int denom1 = 9;
		int num2 = 7;
		int denom2 = 3;
		System.out.println("LCD of fractions : "+obj.LCD(denom1, denom2));
	
	
	}
}