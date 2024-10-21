import java.awt.*;
class UIDemo
{
	UIDemo()
	{
		Frame f = new Frame("UI Demo");
		f.setSize(400, 500);
		f.setVisible(true);
		f.setLayout(null);
		
		
		Choice c = new Choice(); //Dropdown
		c.setBounds(50, 50, 150, 30);
		c.add("Choose Course");
		c.add("HTML");
		c.add("CSS");
		c.add("JavaScript");
		c.add("Java");
		c.add("PHP");
		
		f.add(c);
		
		
		List ls = new List(5);
		ls.add("HTML");
		ls.add("CSS");
		ls.add("JavaScript");
		ls.add("Java");
		ls.add("PHP");
		ls.setBounds(50, 100, 150, 60);
		f.add(ls);
		
		
		Panel p = new Panel();
		p.setBounds(10, 170, 380,300);
		p.setBackground(Color.RED);
		p.setLayout(null);
		f.add(p);
		
		Label l = new Label("Hello World");
		l.setBounds(10, 10, 100, 30);
		p.add(l);
		
		
		MenuBar mb = new MenuBar();
		f.setMenuBar(mb);
		
		
		Menu filemenu = new Menu("File");
		
		MenuItem newmenu = new MenuItem("New");
		MenuItem openmenu = new MenuItem("Open");
		MenuItem savemenu = new MenuItem("Save");
		filemenu.add(newmenu);
		filemenu.add(openmenu);
		filemenu.add(savemenu);
		
		Menu editmenu = new Menu("Edit");
		Menu searchmenu = new Menu("Search");
		
		mb.add(filemenu);
		mb.add(editmenu);
		mb.add(searchmenu);
	}
	

	public static void main(String[] args)
	{
		new UIDemo();
	}
}