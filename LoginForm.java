import java.awt.*;
public class LoginForm
{
public LoginForm()
{
	Frame f= new Frame("Login Form");
	f.setSize(600, 300);
	f.setVisible(true);
	f.setLayout(null);
	
	Label l = new Label("Enter your name: ");
	l.setBounds(50, 100, 150, 30);
	f.add(l);
	
	TextField t = new TextField();
	t.setBounds(300,100, 150, 30);
	f.add(t);
	
	Button b= new Button("Search");
	b.setBounds(200, 200, 100, 30);
	f.add(b);
	
	
	
	
}
public static void main(String[] args)
{
	LoginForm lf = new LoginForm();
}

}
