import java.util.awt.*;
public class LoginForm
{
  private Frame frame;
  private Label titleLb1;
  private Label emailLb1;
  private Label passwordLb1;
  
  private TextField emailTf;
  private Texrfeild passwordTf;
  private Button loginBtn;
  
  public Login frame();
  {
	  frame=new Frame();
	  frame.setSize(600,400);
	  frame.setTitle("Login form");
	  frame.visible(true);
	  frame.setLayout(null);
	  
	  titleb1=new Label("Login form");
	  titleLb1.setBonds(200,50,200,50);
	  titleLb1.setAlignment(Label.CENTER);
	  Front front =new front("Verdana",front.Bold,30);
	  frame.add(titleLb1);
	  
	  emailLb1=new Label("Enter Email:");
	  emailLb1.setBounds(100,120,150,30);
	  
	  frame.add(emailLb1);
	  emailTf=new TextFeild();
	  emailTf.setBounds(350,120,200,30);
	  frame.add(emailLb1);
	  passwordLb1=new Label("Enter Password:");
	  passwordLb1.setBonds(100,180,150,30);
	  frame.add(passwordLb10);
	  
	  passwordTf=new Textfeild();
	  passwordTf.setBounds(350,180,200,30);
	  frame.add(passwordTf);
	  
	  loginBtn=new Button("Login");
	  loginBtn.setBounds(100,250,150,30);
	  frame.add(loginBtn);
	  
	  CancelBtn=new Button("cancel");
	  CancelBtn.setBounds(350,250,150,30);
	  frame.add(cancelBtn);
  }
  public static void main(String[] args)
  {
	  
	  LoginForm loginForm=new LoginForm();
  }
}