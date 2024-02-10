import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2;
	JButton[][] btn;
	int numTurns=0;
	int lastNumTurns = 0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe game = new TicTacToe();
		
		game.setSize(500, 500);
		game.setDefaultCloseOperation(EXIT_ON_CLOSE);
		game.setTitle("Tic Tac Toe");
		
		game.setVisible(true);
		
	}
	public TicTacToe() {
		
		setLayout(new GridLayout(3, 3));
		btn = new JButton[3][3];
		Font font = new Font("Times New Roman",Font.BOLD,40);
		int r, c;
		for(r=0; r< 3;r++) {
			for(c=0;c<3;c++) {
				btn[r][c] = new JButton();
				btn[r][c].addActionListener(new ButtonListener(r, c));
				btn[r][c].setFont(font);
				btn[r][c].setContentAreaFilled(false);
				add(btn[r][c]);
			}
		}
	}
	public void resetGame() {
		int r, c;
		for(r=0; r< 3;r++) {
			for(c=0;c<3;c++) {
				btn[r][c].setText("");
			}
		}		
	}
	public class ButtonListener implements ActionListener {
		int row;
		int col;
		
		public ButtonListener(int r, int c) {
			row = r;
			col = c;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("r" + row + "c" + col);
			if(btn[row][col].getText().length() == 0) {
				numTurns++;
				if(numTurns%2 == 0) {
					btn[row][col].setText("O");
				}
				else {
					btn[row][col].setText("X");
				}
				if(btn[0][0].getText() == btn[0][1].getText() &&
				   btn[0][1].getText() == btn[0][2].getText()
				   &&
				   btn[0][0].getText() != "") {
					JOptionPane.showMessageDialog(null, "Person " + btn[0][0].getText() + " won!");
					lastNumTurns = numTurns;
					resetGame();
				}
				if(btn[1][0].getText() == btn[1][1].getText() &&
						   btn[1][1].getText() == btn[1][2].getText() &&
								   btn[1][0].getText() != "") {
							JOptionPane.showMessageDialog(null, "Person " + btn[1][0].getText() + " won!");
							lastNumTurns = numTurns;
							resetGame();
				}
				if(btn[2][0].getText() == btn[2][1].getText() &&
						   btn[2][1].getText() == btn[2][2].getText() &&
						   btn[2][0].getText() != "") {
							JOptionPane.showMessageDialog(null, "Person " + btn[2][0].getText() + " won!");
							lastNumTurns = numTurns;
							resetGame();
				}
				if(btn[0][0].getText() == btn[1][0].getText() &&
						   btn[1][0].getText() == btn[2][0].getText()&&
								   btn[0][0].getText() != "") {
							JOptionPane.showMessageDialog(null, "Person " + btn[0][0].getText() + " won!");
							lastNumTurns = numTurns;
							resetGame();
				}
				if(btn[0][1].getText() == btn[1][1].getText() &&
						   btn[1][1].getText() == btn[2][1].getText()&&
								   btn[0][1].getText() != "") {
							JOptionPane.showMessageDialog(null, "Person " + btn[0][1].getText() + " won!");
							lastNumTurns = numTurns;
							resetGame();
				}
				if(btn[0][2].getText() == btn[1][2].getText() &&
						   btn[1][2].getText() == btn[2][2].getText()
						   &&
						   btn[0][2].getText() != "") {
							JOptionPane.showMessageDialog(null, "Person " + btn[0][2].getText() + " won!");
							lastNumTurns = numTurns;
							resetGame();
				}
				if(btn[0][0].getText() == btn[1][1].getText() &&
						   btn[1][1].getText() == btn[2][2].getText()&&
								   btn[0][0].getText() != "") {
							JOptionPane.showMessageDialog(null, "Person " + btn[0][0].getText() + " won!");
							lastNumTurns = numTurns;
							resetGame();
				}
				if(btn[0][2].getText() == btn[1][1].getText() &&
						   btn[1][1].getText() == btn[2][0].getText() &&
						   btn[0][2].getText() != "") {
							JOptionPane.showMessageDialog(null, "Person " + btn[0][2].getText() + " won!");
							lastNumTurns = numTurns;
							resetGame();
				}
				if(lastNumTurns == numTurns - 9) {
					JOptionPane.showMessageDialog(null, "Cat's game!");
					numTurns = 0;
					lastNumTurns = 9;
					resetGame();
				}
			}
			
		}
		
	}
}
