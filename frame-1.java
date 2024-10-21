import java.awt.*;
public class frameDemo
{
   public void FrameDemo()
     {
	   Frame fm=new Frame("My new Frame:");
	   fm.SetSize(500,500);
	   fm.SetVisible(true);
	   }   
	   public static void main(String[] args)
	   {
		   FrameDemo f=new FrameDemo();
	   }
}
