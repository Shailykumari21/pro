import java.util.*;
class Area 
{
	int a,ar=0;
   void input()
   {
     System.out.println("Enter the side of square"+a);
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
   }
}
class peri extends Area 
{
   void cal()
   {
      ar=a*a;
	  System.out.println("Area of square ="+ar); 
   }
}
class B
{
public static void main(String args[])
{
	peri obj=new peri();
	obj.input();
	obj.cal();
}
}