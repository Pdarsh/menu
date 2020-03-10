import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Joey  extends Applet implements ActionListener
{
     TextField tf0;
     TextField tf1;
     TextField tf2;
     TextField tf3;
     TextField tf4;
     TextField tf5;
     TextField tf6;
     TextField tf7;
     TextField tf8;
     TextField tf9;
     TextField tf10;
     TextField tf11;
     TextField tf12;
     TextField tf13;
     TextField tf14;
     TextField tf15;
     
	public void init()
	{
		int i;
		setLayout(null);

		Label l1=new Label();
		l1.setText("                          Joey's Pizza");
		l1.setFont(new Font("Times New Roman",Font.BOLD,60));
		l1.setBounds(0,0,1250,100);
		l1.setForeground(Color.yellow);
		l1.setBackground(Color.gray);
		add(l1);

		 tf0=new TextField();
		 tf1=new TextField();
		 tf2=new TextField();
		 tf3=new TextField();
		 tf4=new TextField();
		 tf5=new TextField();
		 tf6=new TextField();
		 tf7=new TextField();										
		 tf8=new TextField();
		 tf9=new TextField();
		 tf10=new TextField();
		 tf11=new TextField();
		 tf12=new TextField();
		 tf13=new TextField();
		 tf14=new TextField();
		 tf15=new TextField();
		

		tf0.setBounds(460,300,100,25);
		tf1.setBounds(460,340,100,25);
		tf2.setBounds(460,380,100,25);
		tf3.setBounds(460,420,100,25);
		tf4.setBounds(460,460,100,25);
		tf5.setBounds(460,500,100,25);
		tf6.setBounds(460,540,100,25);
		tf7.setBounds(1090,300,100,25);
		tf8.setBounds(1090,340,100,25);
		tf9.setBounds(1090,380,100,25);
		tf10.setBounds(1090,420,100,25);
		tf11.setBounds(1090,460,100,25);
		tf12.setBounds(1090,500,100,25);
		tf13.setBounds(1090,540,100,25);
		tf14.setBounds(100,690,50,25);
		tf15.setBounds(160,740,100,30);
		Scrollbar bar=new Scrollbar(Scrollbar.VERTICAL,1100,0,20,1200);
		add(bar);
	
		
		Choice ch=new Choice();
		ch.add("Coke          60/-");
		ch.add("Maaza          60/-");
		ch.add("Plain Lassi          60/-");
		ch.add("Mango Lassi          60/-");
		ch.add("Cold Coco          60/-");
		ch.setBounds(20,660,150,30);
		add(ch);
		add(tf0);
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(tf5);
		add(tf6);
		add(tf7);
		add(tf8);
		add(tf9);
		add(tf10);
		add(tf11);
		add(tf12);
		add(tf13);
		add(tf14);
		add(tf15);

		Button b1=new Button("Total");
		b1.setBounds(20,730,120,50);
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.setBackground(Color.lightGray);
		add(b1);
		b1.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{
		Color c1=new Color(199,186,167);
		setBackground(c1);
		g.setFont(new Font("Times New Roman",Font.BOLD,40));
		g.drawString("MENU",20,180);
		//For VEG Menu
		g.setFont(new Font("Times New Roman",Font.BOLD,25));
		g.drawString("VEG",20,220);
		g.setFont(new Font("Times New Roman",Font.BOLD,20));
		g.drawRect(20,240,550,350);
		g.drawLine(300,240,300,590);
		g.drawLine(440,240,440,590);
		g.drawLine(20,280,570,280);
		g.drawString("ITEMS",40,270);
		g.drawString("PRICE",320,270);
		g.drawString("QUANTITY",460,270);
		//VEG Items
		g.setFont(new Font("Times New Roman",Font.ITALIC,20));
		g.drawString("Fresh Veggie",40,320);
		g.drawString("Delux Veggie",40,360);
		g.drawString("Cheese and Corn",40,400);
		g.drawString("Paneer Makhani",40,440);
		g.drawString("Peppy Paneer",40,480);
		g.drawString("Veg Extravaganza",40,520);
		g.drawString("Mexican Green Wave",40,560);
		//Prices
		g.drawString("300/-",350,320);
		g.drawString("400/-",350,360);
		g.drawString("450/-",350,400);
		g.drawString("500/-",350,440);
		g.drawString("550/-",350,480);
		g.drawString("600/-",350,520);
		g.drawString("650/-",350,560);
		//For NON-VEG Menu
		g.setFont(new Font("Times New Roman",Font.BOLD,25));
		g.drawString("NON-VEG",650,220);
		g.setFont(new Font("Times New Roman",Font.BOLD,20));
		g.drawRect(650,240,550,350);
		g.drawLine(930,240,930,590);
		g.drawLine(1070,240,1070,590);
		g.drawLine(650,280,1200,280);
		g.drawString("ITEMS",670,270);
		g.drawString("PRICE",950,270);
		g.drawString("QUANTITY",1090,270);
		//Non Veg Items
		g.setFont(new Font("Times New Roman",Font.ITALIC,20));
		g.drawString("Pepper Barbecue Chicken",670,320);
		g.drawString("Non Veg Supreme",670,360);
		g.drawString("Chicken Golden Delight",670,400);
		g.drawString("Chicken Dominator",670,440);
		g.drawString("Peri-Peri Chicken",670,480);
		g.drawString("Chicken Tikka",670,520);
		g.drawString("Butter Chicken Special",670,560);
		//Prices
		g.drawString("350/-",980,320);
		g.drawString("450/-",980,360);
		g.drawString("500/-",980,400);
		g.drawString("550/-",980,440);
		g.drawString("550/-",980,480);
		g.drawString("650/-",980,520);
		g.drawString("650/-",980,560);
		//Drinks
		g.setFont(new Font("Times New Roman",Font.BOLD,25));
		g.drawString("Drinks",20,640);
		g.setFont(new Font("Times New Roman",Font.ITALIC,20));
		g.drawString("Quantity",20,710);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int total=0;
		String tot;
		int a,b,c,d,x,f,g,h,i,j,k,l,m,n,o;
		a=Integer.parseInt(tf0.getText());
		b=Integer.parseInt(tf1.getText());
		c=Integer.parseInt(tf2.getText());
		d=Integer.parseInt(tf3.getText());
		x=Integer.parseInt(tf4.getText());
		f=Integer.parseInt(tf5.getText());
		g=Integer.parseInt(tf6.getText());
		h=Integer.parseInt(tf7.getText());
		i=Integer.parseInt(tf8.getText());
		j=Integer.parseInt(tf9.getText());
		k=Integer.parseInt(tf10.getText());
		l=Integer.parseInt(tf11.getText());
		m=Integer.parseInt(tf12.getText());
		n=Integer.parseInt(tf13.getText());
		o=Integer.parseInt(tf14.getText());

		total=total+a*300+b*400+c*450+d*500+x*550+f*600+g*650+h*350+i*450+j*500+k*550+l*550+m*650+n*650+o*60;
		tot=String.valueOf(total);
		tf15.setText(tot);
	}
		

}

/*
<APPLET code="Joey.class" width="1250" height="1200">
</APPLET>
*/
