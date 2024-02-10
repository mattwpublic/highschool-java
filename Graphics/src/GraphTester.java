import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphTester extends JFrame {

	public static void main(String[] args) {
		GraphTester frame = new GraphTester();
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.add(new Canvas());
		frame.setVisible(true);
		
		
	}
	public GraphTester() {
		
	}
}

class Canvas extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.drawLine(100, 200, 100, 0);
		g.drawLine(100, 0, 150, 100);
		g.drawLine(150, 100, 200, 0);
		g.drawLine(200, 0, 200, 200);
		
		g.drawLine(250, 200, 250, 0);
		g.drawLine(250, 200, 300, 100);
		g.drawLine(300, 100, 350, 200);
		g.drawLine(350, 200, 350, 0);

	}
}