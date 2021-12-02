public class Sw {

   public static void main(String args[]) {
      
      char ch = 'A';

      switch(ch) {
         case 'A' :
		 {for(int i=1;i<100;i++)
			 {if((i%2)==1)
				 {
            System.out.println(i); 
            
				 }
			 }
			 break;
		 }
         case 'B' :
		 {for(int i=2;i<=100;i++)
			 {if((i%2)==0)
				 {
            System.out.println(i); 
            
				 }
			 }
			 break;
		 }
         case 'C' :
		 {int x=9;
			 
            int s = (int)Math.sqrt(x);
           
         if(s*s== x)
		 {System.out.println("perfect square");
		 }
		 else
	     {System.out.println("not a perfect square");
		 } break;
		 }
         case 'D' :
		 {int num=2;
		 if(num>=0)
		 {
            System.out.println("+ve");
		 }
		 else{System.out.println("-ve");
		 }break;
		 }
         case 'E' :
		 {
			 int a=5;
			 int b=15;
			 int c=50;
			 if((a>b)&&(a>c))
			 {
			 System.out.println(a+" is greater");}
			 else if((b>a)&&(b>c))
			 {
			 System.out.println(b+" is greater");}
			 else{
			
			 System.out.println(c+" is greater");}
            break;
		 }
		 case 'F':
		 {int number=123;
		 int r=0;
		 while(number!=0)
		 {int rem=number%10;
	 r=r*10+rem;
	 number=number/10;
		 }
		 System.out.println("reverse is "+r);
		 break;
		 }
         default :
            System.out.println("Invalid choice");
      }
      
   }
}