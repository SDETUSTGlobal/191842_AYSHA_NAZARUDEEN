class MethodOverl
{	
	double p,q,r,s,t,res;
	public void display(int a,double b,int c,int d,double e)
	{//percentage
		p=a;
		q=b;
		r=c;
		s=d;
		t=e;
		res=(p+q+r+s+t)/100;
		System.out.println(res);
	}
	public void display(double a,int b,int c,int d,double e)
	{//average
		p=a;
		q=b;
		r=c;
		s=d;
		t=e;
		res=(p+q+r+t+s)/5;
		System.out.println(res);
	}
	public void display(double a,double b,int c,int d,int e)
	{//median
		p=a;
		q=b;
		r=c;
		s=d;
		t=e;
		System.out.println(c);
	}
	public void display(int a,int b)
	{//max
		p=a;
		q=b;
		if(p>q)
			System.out.println(p);
		else
			System.out.println(q);
	}
	public void display(int a,double b)
	{//min
		p=a;
		q=b;
		if(p<q)
			System.out.println(p);
		else
			System.out.println(q);
	}
	
	public static void main(String args[])
	{	
		System.out.println("Numbers: 5,10,20,50,60");
		MethodOverl ob=new MethodOverl();
		
		System.out.println("Percentage :");
		ob.display(20,30.0,5,50,60.0);
		
		System.out.println("Average :");
		ob.display(20.0,30,5,50,60.0);
		
		System.out.println("Median:");
		ob.display(20.0,30.0,10,50,40);
		
		System.out.println("Maximum :");
		ob.display(40,70);
		
		System.out.println("Minimum :");
		ob.display(10,20.0);
		
		
	}
}