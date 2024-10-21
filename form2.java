import java.awt.*;
public class form2
{
	public form2()
	{
     Frame f =new Frame("Aaja thoda Practice Kre");
     f.setSize(800,800);
	 f.setVisible(true);
	 f.setLayout(null);
	 
	 Label l = new Label("Roll No:");
	 l.setBounds(50,50,150,30);
	 f.add(l);
	
	TextField rollNo= new TextField();
	 rollNo.setBounds(200,50,200,30);
	 f.add(rollNo);
	 
	 Button loadRecord = new Button("Load Record");
	 loadRecord.setBounds(500,50,200,30);
	  f.add(loadRecord);
	
	Label email= new Label("Email :");
	 email.setBounds(50,100,150,30);
	 f.add(email);
	 
	 TextField Email = new TextField();
	 Email.setBounds(200,100,200,30);
	 f.add(Email);
	
	 Label course = new Label("Course :");
	 course.setBounds(50,150,150,30);
	 f.add(course);
	 
	 TextField Course = new TextField();
	 Course.setBounds(200,150,200,30);
	 f.add(Course);
	
	Label fee= new Label("Fee :");
	 fee.setBounds(50,200,150,30);
	 f.add(fee);
	 
	 
	 TextField Fee = new TextField();
	 Fee.setBounds(200,200,200,30);
	 f.add(Fee);
	
	Label paid= new Label("Paid :");
	 paid.setBounds(50,250,150,30);
	 f.add(paid);
	 
	 TextField Paid= new TextField();
	 Paid.setBounds(200,250,200,30);
	 f.add(Paid);
	 
	 Label due = new Label("Due :");
	 due.setBounds(50,300,150,30);
	 f.add(due);
	
	TextField Due= new TextField();
	 Due.setBounds(200,300,200,30);
	 f.add(Due);
	 
	 Label address= new Label("Address :");
	 address.setBounds(50,350,150,30);
	 f.add(address);
	
	TextArea ad= new TextArea("");
		ad.setBounds(200,350,200,150);
		f.add(ad);
	
     Label city= new Label("City :");
	 city.setBounds(50,550,150,30);
	 f.add(city);	
	
	TextField City= new TextField();
	 City.setBounds(200,550,200,30);
	 f.add(City);
	
	Label state = new Label("State :");
	 state.setBounds(50,600,150,30);
	 f.add(state);
	
	TextField State = new TextField();
	 State.setBounds(200,600,200,30);
	 f.add(State);
	
	Label country = new Label("Country :");
	 country.setBounds(50,650,150,30);
	 f.add(country);
	
	TextField Country = new TextField();
	 Country.setBounds(200,650,200,30);
	 f.add(Country);
	
	Label contact = new Label("ContactNo :");
	 contact.setBounds(50,700,150,30);
	 f.add(contact);
	
	TextField Contact = new TextField();
	 Contact.setBounds(200,700,200,30);
	 f.add(Contact);
	
	Button update = new Button("Update student");
	 update.setBounds(150,750,200,30);
	  f.add(update);
	
	Button back = new Button("Back");
	 back.setBounds(550,750,100,30);
	  f.add(back);
	}
	
	

public static void main(String[] args)
{
	form2 lf = new form2();
	
} 
}
	 
	 