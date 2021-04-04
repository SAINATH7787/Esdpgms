class halfadder{
	//find how to pass n arguments
	int xor_gate(int n1,int n2)
	{
		int a,b;
		a=n1;
		b=n2;
		//int ans;

		int xor_ans;

		//using | operator
		xor_ans = a ^ b;
		return xor_ans;
	}

	int and_gate(int n1,int n2){
		int a,b;
		a=n1;
		b=n2;

		int and_ans;

		if(n1 == 1 && n2 == 1)
			and_ans = 1;
		else
			and_ans = 0;
	
		return and_ans;	
	}
public static void main(String [] args){

	int inp1=1;
	int inp2=1;
	halfadder lg = new halfadder();
	int res1=lg.xor_gate(inp1,inp2);
	int res2=lg.and_gate(inp1,inp2);
	System.out.println("the output of  sum in half adder  :"+res1);
	System.out.println("the output of carry in half adder :"+res2);
}
}