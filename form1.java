import java.awt.*;
public class form1
{
	public form1()
	{
     Frame f =new Frame("Login Form");
     f.setSize(800,800);
	 f.setVisible(true);
	 f.setLayout(null);
	 
	 Label t4 = new Label("LOGIN");
	 t4.setBounds(150,50,150,30);
	 f.add(t4);
	 
	 Label l =new Label("Email:");
	 l.setBounds(50,100,150,30);
	 f.add(l);
	 
	 Label p =new Label("Password:");
	 p.setBounds(50,150,150,30);
	 f.add(p);
	 
	 TextField t = new TextField();
	 t.setBounds(200,100,200,30);
	 f.add(t);
	 
	 TextField t7 = new TextField();
	 t7.setBounds(500,150,200,30);
	 f.add(t7);
	 
	 TextField t6 = new TextField();
	 t6.setBounds(500,100,200,30);
	 f.add(t6);
	 
	 TextField tl = new TextField();
	 tl.setBounds(200,150,200,30);
	 f.add(tl);
	 
	 Label t5 = new Label("SIGN IN");
	 t5.setBounds(500,50,150,30);
	 f.add(t5);
	 
	 
	 Label r =new Label("Name:");
	 r.setBounds(400,100,150,30);
	 f.add(r);
	 
	 Label p2 =new Label("Place:");
	 p2.setBounds(400,150,150,30);
	 f.add(p2);
	 
	 
	 Label email =new Label("Email:");
	 email.setBounds(400,200,150,30);
	 f.add(email);
	 
	 TextField t8 = new TextField();
	 t8.setBounds(550,200,150,30);
	 f.add(t8);
	 
	 Label pass =new Label("Password:");
	 pass.setBounds(400,250,150,30);
	 f.add(pass);
	 
	 TextField pass1 = new TextField();
	 pass1.setBounds(550,250,150,30);
	 f.add(pass1);
	 
	 
	 Label conpass =new Label("Confirm Password:");
	 conpass.setBounds(400,300,150,30);
	 f.add(conpass);
	 
	 
	 TextField pass2 = new TextField();
	 pass2.setBounds(550,300,150,30);
	 f.add(pass2);
	 
	 Button b = new Button("Login");
	 b.setBounds(50,200,100,30);
	  f.add(b);
	 
	 Button b1 = new Button("Cancel");
	 b1.setBounds(200,200,100,30);
	  f.add(b1);
	  
	  Button b2 = new Button("Cancel");
	 b2.setBounds(400,350,100,30);
	  f.add(b2);
	  
	  
	  Button signUp = new Button("Sign Up");
	 signUp.setBounds(600,350,100,30);
	  f.add(signUp);
	 
}
	 
	 public static void main(String[] args)
	 {
		 form1 lg = new form1();
		 
	 }
}	 