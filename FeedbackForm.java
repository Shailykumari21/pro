import java.awt.*;
public class FeedbackForm
{
	public FeedbackForm()
	{
		Frame fm = new Frame("Feedback");
		fm.setSize(500, 600);
		fm.setVisible(true);
		fm.setLayout(null);
		
		
		Label qualificationLbl = new Label("Qualification: ");
		qualificationLbl.setBounds(50, 50, 100, 30);
		fm.add(qualificationLbl);
		
		Checkbox cb1 = new Checkbox("10th");
		cb1.setBounds(160, 50, 70, 30);
		fm.add(cb1);
		
		
		Checkbox cb2 = new Checkbox("12th");
		cb2.setBounds(240, 50, 70, 30);
		fm.add(cb2);
		
		Checkbox cb3 = new Checkbox("UG");
		cb3.setBounds(320, 50, 70, 30);
		fm.add(cb3);
		
		Label genderLbl =new Label("Gender:");
		genderLbl.setBounds(50, 90, 100, 30);
		fm.add(genderLbl);
		
		
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox mcb = new Checkbox("Male", cbg, false);
		mcb.setBounds(160, 90, 70, 30);
		fm.add(mcb);
		
		Checkbox fcb = new Checkbox("Female", cbg, false);
		fcb.setBounds(240, 90, 70, 30);
		fm.add(fcb);
		
		Checkbox ocb = new Checkbox("Other", cbg, false);
		ocb.setBounds(320, 90, 70, 30);
		fm.add(ocb);
		
		
		
		TextArea ar= new TextArea("Your Feedback");
		ar.setBounds(80,150,200,150);
		fm.add(ar);
		
	}
	
	public static void main(String[] args)
	{
		new FeedbackForm();
	}
}