package pt.progJava.americoLib.control116;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SubControl05_GUI extends JComponent {
	
	
	//ATTRIBUTES
	//CHANGE INPUT DATA ---------------------------------------------
	private final int LINES = 30;				
	//---------------------------------------------------------------
	private JFrame frame = new JFrame();
	private SubControl05_Line_JComponent line = new SubControl05_Line_JComponent();

	
	
	//PAINT COMPONENT
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);

		int spaceBetweenLines = ((getWidth() + getHeight()) / 2) / LINES; //average of both
		int increment = 0; 
		
		
		for (int i = 0; i < LINES; i++) {		
			g.drawLine(getWidth()/LINES + increment,0, getWidth()/LINES + increment, getHeight()); //horizontal
			g.drawLine(0, getHeight()/LINES + increment, getWidth(), getHeight()/LINES + increment);//vertical
			increment += spaceBetweenLines;
						
			line.paintComponent(g); //PAINT COBRA 

		}
	}
	

	//SETUP TO FRAME
	public void setup(SubControl05_GUI gui) {
		frame.setTitle("AmericoLIB SNACK GAME");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocation(100,100);
		
		frame.add(gui); //add gui to frame
		
		frame.repaint();
		frame.setVisible(true);
	}


}
