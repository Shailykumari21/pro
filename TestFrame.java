import java.awt.*;
class TestFrame
{
	TestFrame()
	{
		Frame f = new Frame("Toolkit Demo");
		
		f.setVisible(true);
		
		
		//Get Screen Size
		Toolkit t = Toolkit.getDefaultToolkit();
		System.out.println("Screen Resolution = "+t.getScreenResolution());
		Dimension d = t.getScreenSize();
		System.out.println("Screen Width="+d.width);
		System.out.println("Screen Height="+d.height);
		
		
		//Set Frame size == > Screen Size
		f.setSize(d.width, d.height);
		
		//Get Frame size
		System.out.println("Frame Size="+f.getSize());
		Dimension df = f.getSize();
		System.out.println("Frame Width="+df.width);
		System.out.println("Frame Height="+df.height);
		
		
		//Set Icon of frame
		Image icon = Toolkit.getDefaultToolkit().getImage("notepad.png");
		f.setIconImage(icon);
		
	}
	public static void main(String[] args)
	{
		new TestFrame();
	}
}