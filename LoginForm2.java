import java.awt.*;
public class LoginForm2
{
	public LoginForm2()
	{
     Frame f =new Frame("Login Form");
     f.setSize(600,500);
	 f.setVisible(true);
	 f.setLayout(null);
	 
	 Label l =new Label("Enter your Email:");
	 l.setBounds(50,100,150,30);
	 f.add(l);
	 
	 Label p =new Label("Enter your Password:");
	 p.setBounds(50,150,150,30);
	 f.add(p);
	 
	 TextField t = new TextField();
	 t.setBounds(300,100,200,30);
	 f.add(t);
	 
	 TextField tl = new TextField();
	 tl.setBounds(300,150,200,30);
	 f.add(tl);
	 
	 
	 Button b = new Button("Login");
	 b.setBounds(400,200,100,30);
	  f.add(b);
	 
	 Button b1 = new Button("Cancel");
	 b1.setBounds(50,200,100,30);
	  f.add(b1);
	 
}
	 
	 public static void main(String[] args)
	 {
		 LoginForm2 lg = new LoginForm2();
		 
	 }
}	 