import java.util.*;
class circle
{
double area,r;
void input()
{
  Scanner Sc=new Scanner(System.in);
  System.out.println("Enter Radius:-");
  r=Sc.nextDouble();
}
void findArea()
{
	area=Math.PI*r*r;
}
void display()
{
	System.out.println(area);
}
}
class rev1
{
	public static void main(String args[])
	{
		circle x=new circle();
		x.input();
		x.findArea();
		x.display();
	
	  circle y = new circle();
	  y.input();
	  y.findArea();
	  y.display();
	}
	
}