class arm{
	public static void main(String [] args){
		int a=0,b,c,d,e;
		c=Integer.parseInt(args[0]);
		d=Integer.parseInt(args[1]);
		e=Integer.parseInt(args[2]);
		b=c*100+d*10+e;
		a=(c*c*c)+(d*d*d)+(e*e*e);
		if(b==a)
		System.out.println("Given number is armstrong Number \n");
		else
		System.out.println("given number is not a armstrong Number \n");
}
}