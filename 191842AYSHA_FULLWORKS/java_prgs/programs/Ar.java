class Areaa
{
	float l;
	float b;
	void getdata(float x, float y)
	{
		l=x;
	    b=y;
	}
}
class Ar
{
	public static void main(String args[])
	{
		float area;
		Areaa s = new Areaa();
		s.getdata(5,6);
		area=s.l*s.b;
		System.out.println("Area = " + area);
	}
}