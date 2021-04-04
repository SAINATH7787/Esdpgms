class sum8{
	public static void main(String[] args) {
		int num,i,n1=0,n2=0,n3=0,n4=0,j;
		System.out.println("the numbers that sum of digits 8 is ");
		for(i=0;i<=1000;i++){
			num=i;
			j=i;
				n1=j%10;
				j =j/10;
				n2 =j%10;
				j=j/10;
				n3=j%10;
				j=j/10;
				n4 = j%10; 
			if(n1+n2+n3+n4 == 8)
				System.out.println(num);
		}
	}
}