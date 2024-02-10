import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainProgram extends JFrame {
	
	JTextField jField;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainProgram prog = new MainProgram();
		prog.setSize(600, 800);
		prog.setTitle("Main Program");
		prog.setDefaultCloseOperation(EXIT_ON_CLOSE);
		prog.setVisible(true);
		
	}
	public MainProgram() {
		setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("hi");
		add(btn1);
		btn1.addActionListener(new MyListener("George"));
		btn1.setSize(100, 50);
		
		JButton btn2 = new JButton("hello");
		add(btn2);
		btn2.addActionListener(new MyListener("Mickey"));
		btn2.setSize(100, 50);
		
		jField = new JTextField();
		add(jField);
		jField.setPreferredSize(new Dimension(100, 50));
	}
	class MyListener implements ActionListener {
		String myName;
		public MyListener(String s) {
			myName = s;
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			((JButton)e.getSource()).setText("got me");
			int x = Integer.parseInt(jField.getText());
			System.out.println("Amazing. " + x);
		}
		
	}

}
