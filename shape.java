import java.util.Scanner;
interface shape
{
  public abstract void getData();
  public abstract void calArea();
  public abstract void showArea();
}
class circle implements shape
{
  int r;
  double area;
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
   public void showArea()
   {
	   System.out.println("Area of circle=");
   }
}


class Rectangle implements shape
{
	int l,b;
	double area;
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length=");
		l=sc.nextInt();
		System.out.println("Enter breadth=");
		b=sc.nextInt();
	}
	public void calArea()
	{
		area=l*b;
	}
	public void showArea()
	{
		System.out.println("Area of rectangle="+area);
	}
}
class T()
{
	public static void main(String[] args)
	{
		Circle c=new Circle();
		c.getData();
		c.calArea();
		c.showArea();
		
		Rectangle r=new Rectangle();
		r.getData();
		r.calArea();
		r.showArea();
	}
}