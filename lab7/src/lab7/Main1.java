package lab7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main1 extends Frame{
		Main1(){
			setSize(500,500);
			setVisible(true);
			
		}
		public void paint(Graphics g) {
			super.paint(g);
			
			g.drawLine(100, 130, 200, 130);
			g.drawLine(210, 130, 310, 130);
			g.drawLine(320, 130, 420, 130);
			g.drawLine(100, 140,200 ,140 );
			g.drawLine(210, 140, 310, 140);
			g.drawLine(320, 140,420 ,140 );
			g.drawLine(100, 150,200 ,150 );
			g.drawLine(210, 150, 310, 150);
			g.drawLine(320, 150,420 ,150 );
			
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			});
			
			
		}
		public static void main(String[] args) {
			new Main1();
		}
		}