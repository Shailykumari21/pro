import java.util.Scanner;
abstract class shape
{
 double area;
 public abstract void getData();
 public abstract void CalArea();
 public void showArea()
 {
	System.out.println("Area="+area); 
 }
}
class Circle extends shape
{
   int r; 
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:"); 
		r=sc.nextInt();
	}
	public void calArea()
	{
		area=3.14*r*r;
	}
}
class Rectangle extends shape
{
	int l,b;
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:"); 
		l=sc.nextInt();
		System.out.println("Enter breadth:"); 
		b=sc.nextInt();
	}
	public void calArea()
	{
		area=l*b;
	}
}
class Rectangle extends shape
{
	int l,b;
	public void getData()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length:"); 
		l=sc.nextInt();
		System.out.println("Enter breadth:"); 
		b=sc.nextInt();
	}
	public void calArea()
	{
		area=l*b;
	}
}
class TestMain1
{
	public static void main(String[] args)
	{
		Circle c =new Circle();
		c.getData();
		c.calArea();
		c.showArea();
		
		Rectangle r=new Rectangle();
		r.getData();
		r.calArea();
		r.ShowArea();
	}
}