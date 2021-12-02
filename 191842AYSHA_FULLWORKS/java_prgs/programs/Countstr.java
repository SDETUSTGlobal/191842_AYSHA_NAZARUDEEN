public class Countstr
{
public static void main(String args[])
{
int c=0;
String s="happy birthday";
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)!= ' ')
{
c++;
}
}
System.out.println("Count of characters = " +c);
}
}