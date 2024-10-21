class Test
{
  int x=10;
  static int y=20;
}
class Main
{
	public static void main(String[] args)
	{
		Test t1=new Test();
		Test t1=new Test();
		System.out.println(t1.x+"="+t1.y);
		System.out.println(t2.x+"="+t2.y);
		t1.x=100;
		t1.y=200;
		System.out.println(t1.x+"="+t1.y);
		System.out.println(t2.x+"="+t2.y);
	}
	
}