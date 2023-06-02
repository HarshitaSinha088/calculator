import java.awt.*;
import java.awt.event.*;
class awt10 extends Frame implements ActionListener
{
	int a=0,b=0,c=0;
	TextField tf1,tf2,tf3;
	Label lb1,lb2,lb3;
	Button brestart,bAnswere;
	Checkbox rb1,rb2,rb3,rb4;
	
	awt10()
	{
		lb1=new Label("Number 1");
		lb1.setBounds(50,50,100,50);
		tf1=new TextField("");
		tf1.setBounds(200,50,100,50);
		lb2=new Label("Number 2");
		lb2.setBounds(50,120,100,50);
		tf2=new TextField("");
		tf2.setBounds(200,120,100,50);
		
		CheckboxGroup cbg=new CheckboxGroup();
		rb1=new Checkbox("Sum",false,cbg);
		rb1.setBounds(50,200,100,50);
		rb2=new Checkbox("Multiply",false,cbg);
		rb2.setBounds(150,200,100,50);
		rb3=new Checkbox("Divide",false,cbg);
		rb3.setBounds(50,300,100,50);
		rb4=new Checkbox("Subtraction",false,cbg);
		rb4.setBounds(150,300,100,50);
		
		lb3=new Label();
		
		bAnswere=new Button("Answere");
		bAnswere.setBounds(50,370,100,50);
		bAnswere.addActionListener(this);
		
		tf3=new TextField("");
		tf3.setBounds(200,370,100,50);
		
		brestart=new Button("Restart");
		brestart.setBounds(50,450,100,50);
		brestart.addActionListener(this);
		
		add(lb1);
		add(tf1);
		add(lb2);
		add(tf2); 
		add(rb1);
		add(rb2);
		add(rb3);
		add(rb4);
		add(tf3);
		
		add(bAnswere);
		add(brestart);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bAnswere)
		{
			a=Integer.parseInt(tf1.getText());
			b=Integer.parseInt(tf2.getText());
				
			if(rb1.getState()==true)
				c=a+b;
			else if(rb2.getState()==true)
				c=a*b;
			else if(rb3.getState()==true)
				c=a/b;
			else if(rb4.getState()==true)
				c=a-b;
			
			tf3.setText(String.valueOf(c));
		}
		if(ae.getSource()==brestart)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}
	public static void main(String[] args)
	{
		 new awt10();
	}
}
			
			
	
	
		
		
		
		
		
		
		
		
		
		
