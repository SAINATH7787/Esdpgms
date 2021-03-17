class cal{
	public static void main(String [] args){
		int z,a,b,c,d,e;
		float f;
		z=Integer.parseInt(args[0]);
		a=Integer.parseInt(args[1]);
		b=Integer.parseInt(args[2]);
		int ch=z;
		switch(ch){
		case 1:	
			System.out.println("The sum of numbers is"); 
			c=a+b;
			System.out.println(c);
			break;
		
		case 2:
			System.out.println("The sub of numbers is"); 
			d=a-b;
			System.out.println(d);
			break;
		case 3:
			System.out.println("The mul of numbers is"); 
			e=a*b;
			System.out.println(e);
			break;
		case 4:
			System.out.println("The div of numbers is"); 
			f=a/b;
			System.out.println(f);
			break;
		default : System.out.println("invalid");	
	}
}
}