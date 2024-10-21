import java.util.scanner;
interface shape
{
  public abstract void getData();
  public abstract void calData();
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
}
public void calArea()
{
  area=3.14*r*r;
}
public void showArea()
{
  System.out.println("Area of circle=");
  }
class cuboid implements shape
{
	int l,b,area;
	public void getData()
	{
		Scanner sc=new Scanner();
		System.out.println("Enter length:");
		l=sc.nextInt();
	}
	public void calArea()
	{
		area=(2*l*b)+(2*b*h)+(2*h*l);
		}
		public void showArea()
		{
			
			System.out.println("Area of cuboid="+area);
		}
}
class test5
{
	public static void main(String[] args)
	{
	Circle c=new Circle();
	c.getData();
	c.calArea();
	c.showArea();
	
	Cuboid cb=new Cuboid();
	cb.getData();
	cb.calArea();
	cb.showArea();
	}
}