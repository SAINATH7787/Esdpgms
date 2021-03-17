class Logicgates{
	//find how to pass n arguments
	int or_gate(int n1,int n2)
	{
		int a,b;
		a=n1;
		b=n2;
		//int ans;

		int or_ans;

		//using | operator
		or_ans = a | b;
		return or_ans;
	}

	int nor_gate(int n1,int n2){
		int a,b;
		a=n1;
		b=n2;

		int nor_ans;

		if(n1 == 0 && n2 == 0)
			nor_ans = 1;
		else
			nor_ans = 0;
	
		return nor_ans;	
	}
public static void main(String [] args){

	int inp1=0;
	int inp2=0;
	Logicgates lg = new Logicgates();
	int res1=lg.or_gate(inp1,inp2);
	int res2=lg.nor_gate(inp1,inp2);
	System.out.println("the output of or gate :"+res1);
	System.out.println("the output of nor gate :"+res2);
}
}