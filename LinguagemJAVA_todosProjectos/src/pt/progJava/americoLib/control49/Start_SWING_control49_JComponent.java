package pt.progJava.americoLib.control49;

import javax.swing.JFrame;

public class Start_SWING_control49_JComponent {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.add(new CriarComponente());
		
		
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
