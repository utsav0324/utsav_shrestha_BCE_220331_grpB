package lab5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoSection {
	public TwoSection() {
	Frame frame= new Frame("TwoSection");
	frame.setLayout(new BorderLayout());
	
	Panel leftPanel = new Panel();
	leftPanel.setBackground(Color.GRAY);
	leftPanel.setPreferredSize(new Dimension(200, 400));
	
	
	Button btnleft = new Button("Left");
	leftPanel.add(btnleft);
	frame.add(leftPanel, BorderLayout.WEST);
	
	Panel rightPanel =new Panel();
	rightPanel.setBackground(Color.WHITE);
	Label label = new Label("Right");
	rightPanel.add(label);
	
	rightPanel.setPreferredSize(new Dimension(200, 400));
	frame.add(rightPanel, BorderLayout.CENTER);
	
	btnleft.addActionListener(new ActionListener() {
		
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
	new TwoSection();
	
	
			
	}	
}
