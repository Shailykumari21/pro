import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class TemperatureConverter implements ActionListener
{

	private Frame frame;
	
	private Label firstLabel;
	
	
	private TextField firstTf;
	
	
	private Button ctof;
	private Button ftoc;
	
	private Label resultLabel;
	
	
	public TemperatureConverter()
	{
		frame = new Frame("Temperature Converter");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setLayout(null);
		
		
		firstLabel = new Label("Enter Temperature: ");
		firstLabel.setBounds(20, 50, 150, 30);
		frame.add(firstLabel);
		
		
		firstTf = new TextField();
		firstTf.setBounds(180, 50, 100, 30);
		frame.add(firstTf);
		
		ctof= new Button("C to F");
		ctof.setBounds(30 ,150, 100, 30);
		
		ctof.addActionListener(this);
		
		frame.add(ctof);
		
		
		ftoc = new Button("F to C");
		ftoc.setBounds(150 ,150, 100, 30);
		
		ftoc.addActionListener(this);
		
		frame.add(ftoc);
		
		
		ftok = new Button("C to K");
		ftok.setBounds(30 ,150, 100, 30);
		
		ftok.addActionListener(this);
		
		frame.add(ftok);
		
		ftok = new Button("F to K");
		ftok.setBounds(150 ,200, 100, 30);
		
		ftok.addActionListener(this);
		
		frame.add(ftok);
		
		
		resultLabel = new Label("Welcome");
		resultLabel.setBounds(100, 200, 100, 30);
		resultLabel.setVisible(false);
		frame.add(resultLabel);
		
		
		//Frame closing 
		frame.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent we)
				{
					frame.dispose();
				}
			}
		);
		
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent event)
	{
		
		double x = Double.parseDouble(firstTf.getText());
		
		if(event.getSource()==ctof)
		{	
	        double K = Double.parseDouble(firstTf.getText());
			double K = C + 273.15;
			resultLabel.setText("Temperature:"+K+"K");
			resultLabel.setVisible(true);
		}
		else if(event.getSource()==ftoc)
		{
			double F = Double.parseDouble(firstTf.getText());
			double C = (F-32)*5.0/9.0;
			resultLabel.setText("Temperature:"+C+"C");
			resultLabel.setVisible(true);
			resultLabel.setVisible(true);
		}
		
		else if(event.getSource()==ctok)
		{
			double F = Double.parseDouble(firstTf.getText());
			double C = (F-32)*5.0/9.0;
			resultLabel.setText("Temperature:"+K+"K");
			resultLabel.setVisible(true);
			resultLabel.setVisible(true);
		}
		else{
			resultLabel.setText("");
		}
	}
	
	
	public static void main(String[] args)
	{
	
		new TemperatureConverter();
	}
}