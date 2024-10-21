class Test
{
   Test(double d)
   {
    this(10);
	System.out.println("double-args constructor");
   }
   Test(int x)
   {
   this();
   System.out.println("int-args constructor");
   }
   Test()
   {
      System.out.println("no-args constructor");
   }
}
class boss
{
public static void main(String[] args)
{ 
Test t1=new Test();
Test t2=new Test(10);
Test t3=new Test(10.6);
}
}