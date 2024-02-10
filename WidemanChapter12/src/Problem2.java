import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5184774947700531108L;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 200);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		frame.add(panel1, BorderLayout.CENTER);
		frame.add(panel2, BorderLayout.SOUTH);
		Font font = new Font("Comic Sans MS", Font.BOLD, 40);
		int c;
		JButton[] btn;
		btn = new JButton[6];
		for(c=0; c<6; c++) {
			btn[c] = new JButton();
			if(c<3) {
				btn[c].setText("Button " + (c+1));
				btn[c].setFont(font);
				panel1.add(btn[c]);
			}
			else {
				btn[c].setText("Button " + (c+1));
				btn[c].setFont(font);
				panel2.add(btn[c]);
			}
		}
		frame.setVisible(true);
	}

}
