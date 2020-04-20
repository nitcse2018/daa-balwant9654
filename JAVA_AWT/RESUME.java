import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class RESUME extends Frame implements ActionListener
{
	  String msg;
	  
	  Button b1=new Button(" SUBMIT ");
	  Button b2=new Button(" CANCEL ");
	  
	  Label d1 = new Label("PERSONAL  DETAILS ",Label.LEFT);
	  Label d2 = new Label("EDUCATIONAL  DETAILS ",Label.LEFT);
	  Label d3 = new Label("CONTACT  DETAILS ",Label.LEFT);
	  Label d4 = new Label("NON-PROFESSIONAL  DETAILS ",Label.LEFT);
	  
	  Label l1 = new Label("Name            :",Label.LEFT);
	  Label l2 = new Label("DOB             :",Label.LEFT);
	  Label l3 = new Label("Gender          :",Label.LEFT);
	  Label l4 = new Label("Qualification   :",Label.LEFT);
	  
	  Label l41= new Label("Stream          :",Label.LEFT);
	  Label l42= new Label("Passing year    :",Label.LEFT);
	  Label l43= new Label("Institute       :",Label.LEFT);
	  
	  Label l5 = new Label("Grades           :",Label.LEFT);
	  
	  Label l8 = new Label("Mobile no.      :",Label.LEFT);
	  Label l9 = new Label("E-mail          :",Label.LEFT);
	  Label l10 = new Label("Address        :",Label.LEFT);
	  
	  Label l11 = new Label("Special Talent :",Label.LEFT);
	  Label L11 = new Label("(if any)        ",Label.LEFT);
	  Label l12 = new Label("Hobbies        :",Label.LEFT);
	 
	  
	  TextField name = new TextField();              //  name
	  
	  Choice date = new Choice();
	  Choice month = new Choice();              // DOB
	  Choice year = new Choice();
	  
	  CheckboxGroup cbg=new CheckboxGroup();
	  Checkbox ck1=new Checkbox("Male",false,cbg);    //  gender
	  Checkbox ck2=new Checkbox("Female",false,cbg);
	  
	  Choice qualif = new Choice();
	  Choice stream = new Choice();               //  qualification
	  Choice p_year = new Choice();
	  TextArea instut = new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);   //institute
	  
	  Choice grad = new Choice();                  //  grade
	  
	  Choice isd = new Choice();
	  TextField mob = new TextField();            //  mobile
	  TextField eml = new TextField();            // email
	  
	  TextArea adr = new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);  // address
	  
	  TextArea sp_tl = new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);  // special talent
	  TextArea hobby = new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);  // hobbies

	  
	  public login2()
	  {
		  addWindowListener( new myWindowAdapter() );
		  
		  setBackground(Color.CYAN);
		  setForeground(Color.BLUE);
		  setLayout(null);
		  
		  add(d1);
		  add(l1);   add(l2);   add(l3);
		  
		  add(d2);
		  add(l4);   add(l41);  add(l42);  add(l43);  add(l5); 
		  
		  add(d3);
		  add(l8);   add(l9);   add(l10);
		  
		  add(d4);
		  add(l11);  add(L11);  add(l12);

		  
		  add(name);
		  add(date);    add(month);   add(year);
		  add(ck1);     add(ck2);
		  add(qualif);  add(stream);  add(p_year);  add(instut);
		  add(grad);    add(isd);     add(mob);     add(eml);     add(adr);
		  add(sp_tl);
		  add(hobby);

		  
		  add(b1);      //  SUBMIT
		  add(b2);      //  CANCEL
		  b1.addActionListener(this);
		  b2.addActionListener(this);
		  add(b1);
		  add(b2);
		  
		  date.add("1");   date.add("2");   date.add("3");   date.add("4");   date.add("5");   date.add("6");   date.add("7");   date.add("8");
		  date.add("9");   date.add("10");  date.add("11");  date.add("12");  date.add("13");  date.add("14");  date.add("15");  date.add("16");
		  date.add("17");  date.add("18");  date.add("19");  date.add("20");  date.add("21");  date.add("22");  date.add("23");  date.add("24");
		  date.add("25");  date.add("26");  date.add("27");  date.add("28");  date.add("29");  date.add("30");  date.add("31");
		  
		  month.add("1");  month.add("2");  month.add("3");  month.add("4");  month.add("5");  month.add("6");
		  month.add("7");  month.add("8");  month.add("9");  month.add("10"); month.add("11"); month.add("12");
		  
		  year.add("1980");  year.add("1981");  year.add("1982");  year.add("1983");  year.add("1984");  year.add("1985");  year.add("1986");  
		  year.add("1987");  year.add("1988");  year.add("1989"); 
		  year.add("1990");  year.add("1991");  year.add("1992");  year.add("1993");  year.add("1994");  year.add("1995");  year.add("1996");
		  year.add("1997");  year.add("1998");  year.add("1999");  
		  
		  qualif.add("B.Tech.");
		  qualif.add("M.Tech.");
		  
		  stream.add("Chemical engg.");
		  stream.add("Civil engg.");
		  stream.add("Computer Science / IT engg.");
		  stream.add("Electrical engg.");
		  stream.add("Electronics and Communication engg.");
		  stream.add("Mechanical engg.");
		  
		  p_year.add("2001");  p_year.add("2002");  p_year.add("2003");  p_year.add("2004");  p_year.add("2005");  p_year.add("2006");
		  p_year.add("2007");  p_year.add("2008");  p_year.add("2009");  p_year.add("2010");  p_year.add("2011");  p_year.add("2012");
		  p_year.add("2013");  p_year.add("2014");  p_year.add("2015");  p_year.add("2016");  p_year.add("2017");  p_year.add("2018");
		  p_year.add("2019");  p_year.add("2020");
		  
		  grad.add(">= 9.0");
		  grad.add("8.5-9.0");
		  grad.add("8.0-8.5");
		  grad.add("7.5-8.0");
		  grad.add("7.0-7.5");
		  grad.add("< 7.0");
		
		  isd.add("+91");
		  
		  d1.setBounds(25,50,280,20);
		  
		  		l1.setBounds (90,80, 120,20);  // name
		  		l2.setBounds (90,110,120,20);  // DOB
		  		l3.setBounds (90,140,120,20);  // gender
		  
		  d2.setBounds(25,170,280,20);
		  
		  		l4.setBounds (90,200,120,20);  // qualification
		  		l41.setBounds(90,230,120,20);  // stream
		  		l42.setBounds(90,260,120,20);  // passing year
		  		l43.setBounds(90,290,120,20);  // institute
		  		l5.setBounds (90,340,120,20);  // grades
		  
		  d3.setBounds(25,370,280,20);
		  
		  		l8.setBounds (90,400,120,20);  // mobile
		  		l9.setBounds (90,430,120,20);  // email
		  		l10.setBounds(90,460,120,20);  // address
		  		
		  d4.setBounds(25,520,280,20);
		  		l11.setBounds(90,550,120,20);  // special talent
		  		L11.setBounds(90,567,120,15);
		  		l12.setBounds(90,600,120,20);  // hobbies
		  
		  
		  name.setBounds (260,80,220,20);
		  date.setBounds (260,110,50,20);
		  month.setBounds(320,110,50,20);    //  d1
		  year.setBounds (380,110,80,20);
		  ck1.setBounds(260,140,50,20);
		  ck2.setBounds(310,140,60,20);
		  
		  qualif.setBounds(260,200,100,20);
		  stream.setBounds(260,230,250,20);
		  p_year.setBounds(260,260,100,20);  //  d2
		  instut.setBounds(260,290,300,40);
		  grad.setBounds  (260,340,100,20);
		  
		  isd.setBounds (260,400,50,20);
		  mob.setBounds (330,400,120,20);
		  eml.setBounds (260,430,230,20);    //  d3
		  adr.setBounds (260,460,300,40);
		  
		  sp_tl.setBounds (260,550,270,40);
		  hobby.setBounds (260,600,270,40);    //  d4
		  
		  b1.setBounds(150,650,70,30);
		  b2.setBounds(240,650,70,30);       //  button
		  
	  }
	  
	  public void paint(Graphics g)
	  {
		  g.drawString(msg,200,700);
	  }

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals(" SUBMIT "))
		{	
			msg="*******  Details  have  been  SUBMITTED  *********";
			setForeground(Color.red); 
		}
		
		if(ae.getActionCommand().equals(" CANCEL "))
		{	
			msg="*******  Details  have  been  CANCELLED   *********";
			setForeground(Color.red); 
		}
	}

// ******************   MAIN  FUNCTION  *************************
	
	public static void main(String g[])
	{
		login2 stu=new login2();
		stu.setSize(new Dimension(800,730));
		stu.setTitle(" RESUME ");
		stu.setVisible(true);
	}

// ******************   MAIN  FUNCTION  *************************
}


class myWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}
