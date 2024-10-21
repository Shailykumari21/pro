import java.awt.*;
public class Calculator
{
	public Calculator()
	{
		Frame fm = new Frame("Scientific Calculator");
		fm.setSize(600,600);
		fm.setVisible(true);
		fm.setLayout(null);
		
		
		Label first = new Label("1st");
		first.setBounds(50, 50, 100, 30);
		fm.add(first);
		
		TextField t = new TextField();
	     t.setBounds(150,50,100,30);
	     fm.add(t);
		 
		 
		 Label scical = new Label("Scientific Calculator");
		scical.setBounds(350, 50, 150, 30);
		fm.add(scical);
		
		
		Label second = new Label("2nd");
		second.setBounds(50, 100, 100, 30);
		fm.add(second);
		
		
		TextField sec = new TextField();
	     sec.setBounds(150,100,100,30);
	     fm.add(sec);
		 
		 TextField sec1 = new TextField();
	     sec1.setBounds(350,100,200,30);
	     fm.add(sec1);
		 
		  Button add = new Button("+");
	      add.setBounds(50,150,80,30);
	      fm.add(add);
		  
		   Button sub= new Button("-");
	      sub.setBounds(150,150,80,30);
	      fm.add(sub);
		  
		  
		  Button mul= new Button("*");
	      mul.setBounds(250,150,80,30);
	      fm.add(mul);
		  
		  
		  Button div= new Button("/");
	      div.setBounds(350,150,80,30);
	      fm.add(div);
		  
		  Button clr= new Button("Clear");
	      clr.setBounds(450,150,80,30);
	      fm.add(clr);
		 
		 
		  Button mod = new Button("%");
	      mod.setBounds(50,200,80,30);
	      fm.add(mod);
		  
		  
		  Button sin= new Button("Sin");
	      sin.setBounds(150,200,80,30);
	      fm.add(sin);
		  
		   Button cos= new Button("Cos");
	      cos.setBounds(250,200,80,30);
	      fm.add(cos);
		  
		  
		  Button tan= new Button("Tan");
	      tan.setBounds(350,200,80,30);
	      fm.add(tan);
		  
		  Button ncr= new Button("nCr");
	      ncr.setBounds(450,200,80,30);
	      fm.add(ncr);
		  
		  Button n = new Button("n!");
	      n.setBounds(50,250,80,30);
	      fm.add(n);
		  
		  Button cosec= new Button("Cosec");
	      cosec.setBounds(150,250,80,30);
	      fm.add(cosec);
		  
		  Button Sec= new Button("Sec");
	      Sec.setBounds(250,250,80,30);
	      fm.add(Sec);
		  
		   Button cot= new Button("Cot");
	      cot.setBounds(350,250,80,30);
	      fm.add(cot);
		  
		  
		   Button nPr= new Button("nPr");
	      nPr.setBounds(450,250,80,30);
	      fm.add(nPr);
		  
		  Button root= new Button("√");
	      root.setBounds(50,300,80,30);
	      fm.add(root);
		  
		   Button x= new Button("x^2");
	      x.setBounds(150,300,80,30);
	      fm.add(x);
		  
		   Button x1= new Button("x^3");
	      x1.setBounds(250,300,80,30);
	      fm.add(x1);
		  
		  Button x2= new Button("x^y");
	      x2.setBounds(350,300,80,30);
	      fm.add(x2);
		  
		  Button x3= new Button("x^-1");
	      x3.setBounds(450,300,80,30);
	      fm.add(x3);
		  
		  Button e= new Button("e");
	      e.setBounds(50,350,80,30);
	      fm.add(e);
		  
		  Button e1= new Button("e^x");
	      e1.setBounds(150,350,80,30);
	      fm.add(e1);
		  
		  
		  Button log = new Button("log");
	      log.setBounds(250,350,80,30);
	      fm.add(log);
		  
		  Button ln = new Button("ln");
	      ln.setBounds(350,350,80,30);
	      fm.add(ln);
		  
		  Button ln1 = new Button("|X|");
	      ln1.setBounds(450,350,80,30);
	      fm.add(ln1);
		  
		  Button py = new Button("π");
	      py.setBounds(50,400,80,30);
	      fm.add(py);
		  
		  Button npy = new Button("nπ");
	       npy.setBounds(150,400,80,30);
	      fm.add(npy);
		  
		   Button n2py = new Button("2^X");
	       n2py.setBounds(250,400,80,30);
	      fm.add(n2py);
		  
		   Button n10py = new Button("10^X");
	       n10py.setBounds(350,400,80,30);
	      fm.add(n10py);
		  
		   Button exit = new Button("Exit");
	       exit.setBounds(450,400,80,30);
	      fm.add(exit);
}

	 
	 public static void main(String[] args)
	 {
		 Calculator c = new Calculator();
		 
	 }
}	 