/*
	Josiah Brooks 09/27/18
	This is the GUI project for a5
*/ 
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cswing extends JFrame{
	
	int but_hieght = 105;
	int but__width = 105;
	JLabel lab_message = new JLabel();
	JButton btn_bg = new JButton("Background");
	JButton btn_blue = new JButton("Blue");
	JButton btn_small = new JButton("Shrink");
	JButton btn_large = new JButton("Enlarge");
	JButton btn_one = new JButton("1");
	JButton btn = new JButton("White");
	JButton close_btn = new JButton("Close");
	JFrame f = new JFrame("Ten Different Things");
	
	
	public cswing(){
		
			f.setSize(700,300);
			f.setLocation(200,200);
			f.setLayout(null);
			f.setResizable(false);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			ButtonListener listener = new ButtonListener();
			
			btn_blue.setBounds(130,10,but__width,50);
			btn_blue.addActionListener(listener);
			f.add(btn_blue);
			
			btn_bg.setBounds(10,10,but__width,50);
			btn_bg.addActionListener(listener);
			f.add(btn_bg);
			
			btn_small.setBounds(250,10,but__width,50);
			btn_small.addActionListener(listener);
			f.add(btn_small);
			
			btn_large.setBounds(370,10,but__width,50);
			btn_large.addActionListener(listener);
			f.add(btn_large);
			
			btn_one.setBounds(370,100,but__width,50);
			btn_one.addActionListener(listener);
			f.add(btn_one);
			
			btn.setBounds(250,100,but__width,50);
			btn.addActionListener(listener);
			f.add(btn);
			
			close_btn.setBounds(130,100,but__width,50);
			close_btn.addActionListener(listener);
			f.add(close_btn);
			
			
			
			lab_message.setBounds(10,70,100,20);
			lab_message.setText(" --- ");
			f.add(lab_message);
			/*
			lab_image.setBounds(40,40,100,100);
			ImageIcon image = new ImageIcon("skyline.jpg");
			lab_image.setIcon(image); 
			lab_image.setVisible(false);
			f.add(lab_image);
			//f.add(new JLabel(new ImageIcon("skyline.jpg")));
			*/
			f.setVisible(true);
	}
	
	public static void main(String args[]) {
			new cswing();
	}
	
	
	
	class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn_blue) {
				lab_message.setText("Blue");
				lab_message.setForeground(Color.blue);
			}
			if(e.getSource() == btn_bg) {
				lab_message.setText("Background");
				lab_message.setForeground(Color.green);
				f.getContentPane().setBackground(Color.green);
			}
				
			if(e.getSource() == btn_small) {
				but_hieght = but_hieght - 5;
				but__width = but__width - 5;
				btn_small.setBounds(250,10,but__width,but_hieght);
			}
			
			if(e.getSource() == btn_large) {
				but_hieght = but_hieght + 5;
				but__width = but__width + 5;
				btn_large.setBounds(370,10,but__width,but_hieght);
				
			}
			
				if(e.getSource() == btn_one) {
				lab_message.setText("1");
				btn_one.setBounds(370,100,but__width,50);
			}
			
			if(e.getSource() == btn) {
				lab_message.setText("White");
				btn.setBackground(Color.white);
				btn.setForeground(Color.gray);
				lab_message.setForeground(Color.black);
				btn.setBounds(250,100,but__width,50);
			}
			
			if(e.getSource() == close_btn) {
				lab_message.setText("Close");
				close_btn.setBounds(130,100,but__width,50);
			}
			
		}
	}
}
