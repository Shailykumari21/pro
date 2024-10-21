import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class BasicCalculator implements ActionListener
{

	private Frame frame;
	
	private Label firstLabel;
	private Label secondLabel;
	
	private TextField firstTf;
	private TextField secondTf;
	
	private Button addBtn;
	private Button subBtn;
	
	private Label resultLabel;
	
	
	public BasicCalculator()
	{
		frame = new Frame("Basic Calculator");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setLayout(null);
		
		
		firstLabel = new Label("Enter first number: ");
		firstLabel.setBounds(20, 50, 150, 30);
		frame.add(firstLabel);
		
		
		firstTf = new TextField();
		firstTf.setBounds(180, 50, 100, 30);
		frame.add(firstTf);
		
		secondLabel = new Label("Enter second number: ");
		secondLabel.setBounds(20, 100, 150, 30);
		frame.add(secondLabel);
		
		secondTf = new TextField();
		secondTf.setBounds(180, 100, 100, 30);
		frame.add(secondTf);
		
		addBtn = new Button("ADD");
		addBtn.setBounds(45 ,150, 100, 30);
		
		addBtn.addActionListener(this);
		
		frame.add(addBtn);
		
		subBtn = new Button("SUB");
		subBtn.setBounds(155, 150, 100, 30);
		subBtn.addActionListener(this);
		frame.add(subBtn);
		
		
		resultLabel = new Label("Welcome");
		resultLabel.setBounds(100, 200, 100, 30);
		resultLabel.setVisible(false);
		frame.add(resultLabel);
		
		
		
		
		
		
		
		//Frame closing 
		frame.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					frame.dispose();
				}
			}
		);
		
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent event)
	{
		
		int x = Integer.parseInt(firstTf.getText());
		int y = Integer.parseInt(secondTf.getText());
		
		if(event.getSource()==addBtn)
		{	
			int r = x + y;
			resultLabel.setText("Sum = "+r);
		}
		else if(event.getSource()==subBtn)
		{
			int r = x - y;
			resultLabel.setText("Sub = "+r);
		}
		resultLabel.setVisible(true);
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
	
		new BasicCalculator();
	}
}