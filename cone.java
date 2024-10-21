import java.io.*;
class Area{
	public static void main(String[] args)throws Exception
	{
		Double r,l,area;
		InputStreamReader ir=new InputStreamReader(System.in); 
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter radius:");
		r=Double.parseDouble(br.readLine( ));
		System.out.println("Enter length:");
		l=Double.parseDouble(br.readLine());
	    area=3.14*r*(l+r);
		System.out.println("Area of cone="+area);
	}
}