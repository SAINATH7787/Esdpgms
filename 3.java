//printing ascii values

class ascii{
	public static void main(String []args){
		int ch1 = 'A',ch2 = 'a',ch3 = 0,i,j=48;
		for(i=0;i<26;i++)
		System.out.format("ascii value of %c: %d\n",ch1+i,ch1+i);
		for(i=0;i<26;i++)
		System.out.format("ascii value of %c: %d\n",ch2+i,ch2+i);
		for(i=0;i<10;i++)
		System.out.format("ascii value of %d: %d\n",ch3+i,j+i);
	}
}