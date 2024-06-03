package Lab4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.border.Border;

public class BorderLayout {
	BorderLayout(){
	Frame frame= new Frame("borderLayout");
	frame.setLayout(new java.awt.BorderLayout());
	
	Button btnN = new Button("North");
	//btnN.setBounds(0, 40, 300, 20);
	frame.add(btnN, java.awt.BorderLayout.NORTH);
	
	Button btnW = new Button("West");
	//btnW.setBounds(0, 60, 100, 80);
	frame.add(btnW,java.awt.BorderLayout.WEST);
	
	Button btnC = new Button("Center");
	//btnC.setBounds(100, 60, 100,80);
	frame.add(btnC, java.awt.BorderLayout.CENTER);
	
	Button btnE = new Button("East");
	//btnE.setBounds(200, 60, 100,80);
	frame.add(btnE, java.awt.BorderLayout.EAST);
	
	Button btnS = new Button("South");
	//btnS.setBounds(0, 140, 300,20);
	frame.add(btnS, java.awt.BorderLayout.SOUTH);

	
	
	frame.setSize(300,300);
	frame.setVisible(true);
	
	frame.addWindowListener(new WindowAdapter() {
		 @Override
         public void windowClosing(WindowEvent e) {
             frame.dispose();
         }
	});
	}
	public static void main(String[]args) {
		new BorderLayout();
		
	}
		
}


