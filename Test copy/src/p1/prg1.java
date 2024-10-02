
package p1;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
class Calculator implements ActionListener{
	JTextField txt[];
	public Calculator()
	{
	JFrame f=new JFrame();
	f.setLayout(null);
	Font font=new Font("verdana",1,15);
	
	f.setTitle("My First GUI Application");
	f.setSize(500,300);
	JLabel lbl1=new JLabel("A Simple Calculator");
	lbl1.setBounds(10, 10, 250, 50);
	lbl1.setFont(font);
	f.add(lbl1);
	
	JLabel lbl2=new JLabel("First Number");
	lbl2.setBounds(10, 50, 150, 50);
	lbl2.setFont(font);
	f.add(lbl2);
	
	JLabel lbl3=new JLabel("Second Number");
	lbl3.setBounds(10, 100, 150, 50);
	lbl3.setFont(font);
	f.add(lbl3);
	
	
	JLabel lbl4=new JLabel("Result");
	lbl4.setBounds(10, 150, 150, 50);
	lbl4.setFont(font);
	f.add(lbl4);
	
	txt=new JTextField[3];
	int x=160,y=50;
	for(int i=0;i<3;i++)
	{
		txt[i]=new JTextField();
		txt[i].setFont(new Font("arial",1,14));
		txt[i].setBounds(x,y+10,70,30);
		f.add(txt[i]);
		y+=50;
	}
	
	JButton btn[]=new JButton[4];
	String op[]= {" + "," - "," x "," / "};
	x=10;y=200;
	for(int i=0;i<4;i++)
	{
		btn[i]=new JButton(op[i]);
		btn[i].setFont(font);
		btn[i].setBounds(x,y,70,30);
		btn[i].addActionListener(this);
		f.add(btn[i]);
		x+=80;
	}
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		int a=Integer.parseInt(txt[0].getText());
		int b=Integer.parseInt(txt[1].getText());
		int c=0;
		switch(s)
		{
		case " + ": c=a+b; break;
		case " - ": c=a-b; break;
		case " x ": c=a*b; break;
		case " / ": c=a/b; break;
		}
		txt[2].setText(""+c);
	}
}
public class prg1 {

	public static void main(String[] args) {
		new Calculator();
	}

}
