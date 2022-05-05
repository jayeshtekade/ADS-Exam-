class stack_Q3
{
	int a[];
	int size;
	int top1;
	int top2;
	
	stack_Q3(int s){
		size=s;
		a=new int[size];
		top1=-1;
		top2=s;
	}
	
	void push1(int i)
	{
		
		if(top1>top2-1)
		{
			System.out.println("stack is full");
		}else
		{
			top1++;
			a[top1]=i;
		}
	}
	void push2(int j)
	{
		
		if(top1>top2-1)
		{
			System.out.println("stack is full");
		}
		else{
			top2--;
			a[top2]=j;
		}
	}
	
	void pop1(){
		
		if(top1==-1){
			System.out.println("stack is empty");
		}else{
			int b=a[top1];
			top1--;
			System.out.println("Popped elementfrom stack1 is "+b);
		}
	}
	void pop2(){
		
		if(top2==size){
			System.out.println("stack is empty");
		}else{
			int b=a[top2];
			top2--;
			System.out.println("Popped elementfrom stack2 is "+b);
		}
	}
	
	
	public static void main(String args[]){
		stack_Q3 s1 = new stack_Q3(10);
		s1.push1(5);
		s1.push2(10);
		s1.push2(15);
		s1.push1(11);
		s1.push2(7);
		s1.push2(40);
		s1.pop1();
		s1.pop2();
	}
}
