package lab5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;

public class SecndLayout {
	public SecndLayout() 
	{	
	Frame frame=new Frame("Form Section");
	
	frame.setLayout(new BorderLayout());
	
	Panel LeftPanel=new Panel();
	Label lblEmail=new Label("Email");
	LeftPanel.add(lblEmail);
	LeftPanel.setBackground(Color.GRAY);
	LeftPanel.setPreferredSize(new Dimension(250,500));
	frame.add(LeftPanel, BorderLayout.WEST);
	
	Panel RightPanel=new Panel();
	Label lblRightl=new Label("User ko email");
	RightPanel.add(lblRightl);
	RightPanel.setBackground(Color.WHITE);
	RightPanel.setPreferredSize(new Dimension(250,500));
	frame.add(RightPanel, BorderLayout.EAST);
	
	 ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setText("hello");
			rightPanel.setBackground(Color.ORANGE);
			leftPanel.setBackground(Color.RED);
		}
	});
	frame.setSize(400, 400);
	frame.setVisible(true);
	}
	public static void main(String[] args) {
		new SecndLayout();
	}
}