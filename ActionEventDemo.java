/**
 * ActionEventDemo
 */
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Image;
public class ActionEventDemo implements ActionListener, KeyListener{

    private Frame frame;

    private Label tempLabel;
     private Label1 tempLabel1;
    private TextField tempTextField;
    private TextField1 tempTextField1;
    private Button convertButton;
    private Button1 convertButton1;
    private Label resultLabel;

    public ActionEventDemo(){
            frame = new Frame("Temperature Convertor");
            
            Image icon = Toolkit.getDefaultToolkit().getImage("temperature.png");
            frame.setIconImage(icon);
            
            Dimension d = new Dimension(700, 100);
            frame.setSize(d);

            frame.setVisible(true);
            frame.setLayout(new FlowLayout());

            tempLabel = new Label();
            tempLabel.setText("Enter Temperature C:");
            frame.add(tempLabel);

            tempLabel1 = new Label();
            tempLabel1.setText("Enter Temperature in F:");
            frame.add(tempLabel1);

            tempTextField = new TextField(20);
            tempTextField.addKeyListener(this);
            frame.add(tempTextField);

             tempTextField1 = new TextField(20);
            tempTextField.addKeyListener(this);
            frame.add(tempTextField);


            tempTextField1 = new TextField(20);
            tempTextField1.addKeyListener(this);
            frame.add(tempTextField1);

            convertButton = new Button();
            convertButton.setLabel("C to F");
            convertButton.addActionListener(this);
            frame.add(convertButton);

            resultLabel = new Label();
            resultLabel.setSize(150, 30);
            frame.add(resultLabel);
            

    }



    public void actionPerformed(ActionEvent event){
        String text = tempTextField.getText();
        if(text==null || text.equals(""))
        {
            resultLabel.setText("Please enter temperature!");
            resultLabel.setForeground(Color.RED);
            resultLabel.setVisible(true);
        }
        else{
            double temp = Double.parseDouble(text);
            double f = 1.8 * temp + 32;
            resultLabel.setText(f+" F");
            resultLabel.setVisible(true);
        }
    }

    public void keyPressed(KeyEvent event){

    }
    public void keyReleased(KeyEvent event){
        String text = tempTextField.getText();
        double temp = Double.parseDouble(text);
            double f = 1.8 * temp + 32;
            resultLabel.setText(f+" F");
            resultLabel.setForeground(Color.RED);
            resultLabel.setVisible(true);

    }
    public void keyTyped(KeyEvent event){

    }

    public static void main(String[] args) {
        new ActionEventDemo();       
    }
}