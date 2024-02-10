import java.awt.*;

import javax.swing.*;

public class Problem1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -343119624336521675L;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 100);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		frame.add(panel1);
		frame.add(panel2);
		Font font = new Font("Comic Sans MS", Font.BOLD, 20);

		int c;
		JButton[] btn;
		btn = new JButton[6];
		for(c=0; c<6; c++) {
			btn[c] = new JButton();
			if(c<3) {
				btn[c].setText("Button " + (c + 1));
				btn[c].setFont(font);
				panel1.add(btn[c]);
			}
			else {
				btn[c].setText("Button " + (c + 1));
				btn[c].setFont(font);
				panel2.add(btn[c]);
			}
		}
		frame.setVisible(true);
	}

}
