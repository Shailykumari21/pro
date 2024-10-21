class single
{
  void A()
  {
    System.out.println("class A");
  }
  class B extends A
  {
     void B()
     {
       System.out.println("class B is child of class B");
     }
  }
public static void main(String[] args)
{
  B obj=new B();
  obj.single();
  obj.A();
}
}