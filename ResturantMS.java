import java.awt.*;
public class ResturantMS 
{
  public ResturantMS()
  {
  Frame f =new Frame("Resturant Management System");
     f.setSize(1500,1000);
	 f.setVisible(true);
	 f.setLayout(null);
	 
	 Label top = new Label("Resturant Management System");
	 top.setFont(new Font("Arial", Font.BOLD, 40));
	 top.setBounds(500,50,600,54);
	 f.add(top);
   
   Button billNoBtn = new Button("Bill number");
	 billNoBtn.setBounds(70,130,100,30);
	  f.add(billNoBtn);
	
   TextField BillNo = new TextField();
	 BillNo.setBounds(180,130,100,30);
	 f.add(BillNo);
		
		
	Panel firstp = new Panel();
    firstp.setBounds(10,170,400,200);
    firstp.setBackground(Color.pink);
    firstp.setLayout(null);
    f.add(firstp);

		Checkbox cb1 = new Checkbox("Chicken Burger");
		cb1.setBounds(10, 10, 100, 30);
		firstp.add(cb1);
		
		
		Checkbox cb2 = new Checkbox("Chicken Burger Meal");
		cb2.setBounds(10, 50, 120, 30);
		firstp.add(cb2);
		
		Checkbox cb3 = new Checkbox("Bacon And Cheese");
		cb3.setBounds(10, 100, 120, 30);
		firstp.add(cb3);
		
		Checkbox tax = new Checkbox("Tax");
		tax.setBounds(10,140, 50, 30);
		firstp.add(tax);
		
		Checkbox HD = new Checkbox("Home Delivery");
		HD.setBounds(70,140, 100, 30);
		firstp.add(HD);
	
		
	TextField ChickenB = new TextField();
	 ChickenB.setBounds(250,10,100,30);
	 firstp.add(ChickenB);
	 
	
	TextField ChickenBM = new TextField();
	 ChickenBM.setBounds(250,50,100,30);
	 firstp.add(ChickenBM);
	 
	 
	TextField  BackonCheese = new TextField();
	 BackonCheese.setBounds(250,100,100,30);
	 firstp.add(BackonCheese);
	 
	 Choice c = new Choice(); //Dropdown
		c.setBounds(250, 150, 100, 30);
		c.add("Apple juice");
		c.add("Clear Apple Juice");
		c.add("Cold Apple Juice");
		firstp.add(c);
		

	Label Drinks = new Label("Drinks");
	Drinks.setBounds(10,0,50, 30);
		firstp.add(Drinks);
		
		
		Panel secondp = new Panel();
    secondp.setBounds(450,170,450,200);
    secondp.setBackground(Color.pink);
    secondp.setLayout(null);
    f.add(secondp);
		
		Choice name = new Choice(); //Dropdown
		name.setBounds(170, 10, 100, 30);
		name.add("Name");
		name.add("Shaily");
		name.add("Aayush");
		name.add("Avinash");
		name.add("Ishi");
		secondp.add(name);
		
		TextField tf = new TextField();
	tf.setBounds(170,50,100,30);
	 secondp.add(tf);
	 
	 TextField tf1 = new TextField();
	tf1.setBounds(170,100,100,30);
	 secondp.add(tf1);
	 
	 Button convertBtn = new Button("Convert");
	 convertBtn.setBounds(105,150,80,30);
	  secondp.add(convertBtn);
	  
	  Button closeBtn = new Button("Close");
	 closeBtn.setBounds(300,150,80,30);
	  secondp.add(closeBtn);
	  
	  Panel thirdp = new Panel();
    thirdp.setBounds(10,390,400,200);
    thirdp.setBackground(Color.pink);
    thirdp.setLayout(null);
    f.add(thirdp);

	TextField tf2 = new TextField();
	tf2.setBounds(10,15,150,30);
	 thirdp.add(tf2);
	 
	 TextField cod = new TextField();
	cod.setBounds(200,15,100,30);
	 thirdp.add(cod);
	 
	 TextField com = new TextField();
	com.setBounds(200,55,100,30);
	 thirdp.add(com);
	 
	  TextField coDlivery = new TextField();
	coDlivery.setBounds(200,95,100,30);
	 thirdp.add(coDlivery);
	 
	 
	 Panel fourthp = new Panel();
    fourthp.setBounds(450,390,450,200);
    fourthp.setBackground(Color.pink);
    fourthp.setLayout(null);
    f.add(fourthp);
	
	
	Panel fifthp = new Panel();
    fifthp.setBounds(10,600,900,95);
    fifthp.setBackground(Color.pink);
    fifthp.setLayout(null);
    f.add(fifthp);
	 
	 
	 Button totalBtn = new Button("Total");
	 totalBtn.setBounds(50,25,90,30);
	  fifthp.add(totalBtn);
	  
	  	 Button receiptBtn = new Button("Receipt");
	 receiptBtn.setBounds(200,25,90,30);
	 fifthp.add(receiptBtn);
	 
	 Button resetBtn = new Button("Reset");
	 resetBtn.setBounds(380,25,90,30);
	 fifthp.add(resetBtn);
	 
	 
	 Button exitBtn = new Button("Exit");
	 exitBtn.setBounds(550,25,90,30);
	 fifthp.add(exitBtn);

	 Button saveBtn = new Button("Save");
	 saveBtn.setBounds(700,25,90,30);
	 fifthp.add(saveBtn);


	Panel sixthp = new Panel();
    sixthp.setBounds(500,30,600,100);
   sixthp.setBackground(Color.red);
    sixthp.setLayout(null);
    f.add(sixthp);
	
	TextField tfe = new TextField();
	tfe.setBounds(300,30,100,30);
	 fourthp.add(tfe);
	
	
	TextField tfei = new TextField();
	tfei.setBounds(300,140,100,30);
	 fourthp.add(tfei);
	 
	 TextField tfeil = new TextField();
	tfeil.setBounds(300,90,100,30);
	 fourthp.add(tfeil);
	
	
	Panel seventhp = new Panel();
    seventhp.setBounds(920,170,500,530);
   seventhp.setBackground(new Color(254, 120, 255));
    seventhp.setLayout(null);
    f.add(seventhp);
	
	
  TextArea ta= new TextArea("");
		ta.setBounds(940,350,300,450);
		seventhp.add(ta);
  
  
}

public static void main(String[] args)
{
	ResturantMS RMS = new ResturantMS();
	
} 
}