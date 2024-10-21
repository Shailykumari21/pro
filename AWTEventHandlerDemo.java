import java.awt.*;
import java.awt.event.*;
class AWTEventHandlerDemo implements ItemListener
{
	Frame frame;
	Checkbox cb1, cb2, cb3;
	Label titleLabel, resultLabel;
	
	AWTEventHandlerDemo()
	{
		frame = new Frame("AWTEventHandlerDemo");
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLayout(null);
		
		titleLabel = new Label("Choose Courses:");
		titleLabel.setBounds(50, 50, 150, 30);
		frame.add(titleLabel);
		
		
		cb1 = new Checkbox("C++");
		cb1.setBounds(210, 50, 50, 30);
		frame.add(cb1);
		
		
		cb2 = new Checkbox("Java");
		cb2.setBounds(270, 50, 50, 30);
		frame.add(cb2);
		
		cb3 = new Checkbox("Python");
		cb3.setBounds(330, 50, 50, 30);
		frame.add(cb3);
		
		
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		
		resultLabel = new Label("");
		resultLabel.setBounds(100, 100, 200, 30);
		frame.add(resultLabel);
		
	}
	public void itemStateChanged(ItemEvent e)
	{
			if(e.getSource()==cb1)
			{
				if(e.getStateChange()==1)
				{
					resultLabel.setText(cb1.getLabel()+" is selected.");
				}
				else if(e.getStateChange()==2)
				{
					resultLabel.setText(cb1.getLabel()+" is deselected.");
				}
				
			}
			else if(e.getSource()==cb2)
			{
				if(e.getStateChange()==1)
				{
					resultLabel.setText(cb2.getLabel()+" is selected.");
				}
				else if(e.getStateChange()==2)
				{
					resultLabel.setText(cb2.getLabel()+" is deselected.");
				}
				
				
				//resultLabel.setText("Checkbox2 is Selected:"+e.getStateChange());
			}
			else if(e.getSource()==cb3)
			{
				if(e.getStateChange()==1)
				{
					resultLabel.setText(cb3.getLabel()+" is selected.");
				}
				else if(e.getStateChange()==2)
				{
					resultLabel.setText(cb3.getLabel()+" is deselected.");
				}
				//resultLabel.setText("Checkbox3 is Selected:"+e.getStateChange());
			}
		
	}
	public static void main(String[] args)
	{
		new AWTEventHandlerDemo();
	}
}