public class Book
{
int bkid;
String bkname;
int price;
int pages;
Book()
{
bkid = 1;
bkname = "The Last Avatar";
price = 193;
pages = 320;
}
Book(int id)
{

bkid = id;
bkname = "The Alchemist";
price = 198;
pages = 154; 
}
Book(int id, String name)
{
bkid = id;
bkname = name;
price = 219;
pages = 247;
}
Book(int id, int p, int page, String name)
{
bkid = id;
bkname = name;
price= p;
pages = page;
}
void show()
{
System.out.println(+ bkid + "\n" + bkname + "\n" + pages + "\n" + price + "\n" );

}

public static void main(String args[])
{
Book b = new Book();
Book b1 = new Book(2);
Book b2= new Book(3, "Leave The World Behind");
Book b3 = new Book(4,199,320,"Memorial");
b.show();
b1.show();
b2.show();
b3.show();
}
}