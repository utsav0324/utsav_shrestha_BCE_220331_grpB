package Lab4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class layout2 {
    public int a = 0;

    layout2() {
        Frame frame = new Frame();
        frame.setLayout(new BorderLayout());

        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());
        Button btn = new Button("Increase");
        panel.add(btn);
        frame.add(panel, BorderLayout.WEST);

        Panel panel1 = new Panel();
        panel1.setLayout(new FlowLayout());
        Label lbl = new Label("The number is:");
        panel1.add(lbl);
        Label result = new Label("0");
        panel1.add(result);
        frame.add(panel1, BorderLayout.EAST);

        frame.setSize(500, 500);
        frame.setVisible(true);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = a + 1;
                result.setText(String.valueOf(a));
                System.out.println(a);
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new layout2();
    }
}
