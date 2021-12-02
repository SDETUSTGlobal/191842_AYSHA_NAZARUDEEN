class Fibonacci
{
public static void main(String args[])
{
int f,s,t;
int c=10;
f=0;
s=1;
System.out.println(f);
System.out.println(s);
for(int i=2;i<c;i++)
{
t=f+s;
System.out.println(t);
f=s;
s=t;
}
}
}