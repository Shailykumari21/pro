import java.util.*;
class EvenOrOdd
{
	Scanner Sc = new Scanner(System.in);
	int num;
	void get()
	{
		System.out.println("Enter number you want to check:-");
		num=Sc.nextInt();
	}
	void check()
	{
		if(num%2==0)
			System.out.println(num+"is Even");
		else 
			System.out.println(num+" is not Even it is Odd");
	}
}
	class rev2
	{
		public static void main(String args[])
		{
			EvenOrOdd ev = new EvenOrOdd();
			ev.get();
			ev.check();
		}
}