class St{  
   int rollno;
   String name;  
   static String college ="Sjcet"; 
     
   St(int roll, String nme)
   {  
   rollno = roll;  
   name = nme;  
   }  
     
   void display ()
   {
   System.out.println(rollno+" "+name+" "+college);
   }  
}  
  
public class Stud
{  
 public static void main(String args[])
 {  
 St s1 = new St(1,"Aysha");  
 St s2 = new St(2,"Ben");  
 St s3 = new St(3,"Chandini");  
 St s4 = new St(4,"David");  
 St s5 = new St(5,"Feba");  
 
 
 s1.display(); 
 s2.display(); 
 s3.display(); 
 s4.display();  
 s5.display(); 

 }  
}  