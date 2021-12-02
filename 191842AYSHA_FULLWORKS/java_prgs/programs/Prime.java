class Prime
{
public static void main(String args[])
{
int i;
int n=0;
for(i=1;i<=10;i++)
{
	int c=0;
for(n=i;n>=1;n--)
{
	if(i%n==0)
	{c++;
	}
}
if(c==2)
	
System.out.println(i);
}
}
}