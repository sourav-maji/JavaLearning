
// package p1;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
class CelToFaren implements ActionListener{
	JTextField txt1, txt2;
	public CelToFaren()
	{
	JFrame f=new JFrame();
	f.setLayout(null);
	Font font=new Font("verdana",1,15);
	
	f.setTitle("Celcious To Farenhight");
	f.setSize(500,300);
	
	// title label
	JLabel lbl1=new JLabel("Celcious To Farenhight");
	lbl1.setBounds(50, 10, 250, 50);
	lbl1.setFont(font);
	f.add(lbl1);
	
	// First label for Celcious
	
	JLabel lbl2=new JLabel("Celcious");
	lbl2.setBounds(30, 50, 120, 50);
	lbl2.setFont(font);
	f.add(lbl2);
	
	// For Celcious text filed
	
	txt1=new JTextField();
	txt1.setFont(new Font("arial",1,14));
	txt1.setBounds(170,60,60,30);
	f.add(txt1);
	
	// Second Label for Farenhight
	JLabel lbl3=new JLabel("Farenhight");
	lbl3.setBounds(30, 90, 120, 50);
	lbl3.setFont(font);
	f.add(lbl3);
	
	// For Farenhight text filed
	
	txt2=new JTextField();

	txt2.setFont(new Font("arial",1,14));
	txt2.setBounds(170,100,60,30);
	f.add(txt2);
	
	// Label for Button
	
	JButton btn=new JButton("Convert");
	btn.setBounds(150,150,100,40);
	btn.addActionListener(this);
	f.add(btn);
	
	// For making the frame visible . By default the frame is invisible
	
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// function for performing the Convert operation
	
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		int a=Integer.parseInt(txt1.getText());
		int b = ((9*a) +160)/5;
		
		txt2.setText(""+b);
	}
	
	
}
public class prg2 {

	public static void main(String[] args) {
		new CelToFaren();
	}

}
