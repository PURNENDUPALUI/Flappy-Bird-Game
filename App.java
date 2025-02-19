
import javax.swing.*;
public class App {
	public static void main(String args[]) {
		int boardwidth=360;
		int boardheight=640;
		
		JFrame frame = new JFrame("Flappy Bird");
		frame.setVisible(true);
		frame.setSize(boardwidth,boardheight);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		flappybird fb=new flappybird();
		frame.add(fb);
		frame.pack();
		fb.requestFocus();
		frame.setVisible(true);
	}
}
