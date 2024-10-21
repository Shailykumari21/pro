class single
{
 void A()
 {
 System.out.println(" Avish");
 }
}
class shaily extends single 
{
  void B()
  {
   System.out.println(" nawabi");
  }
}
class B
{
public static void main(String[] args)
{
  shaily obj=new shaily();
    obj.A();
    obj.B();	
}
}