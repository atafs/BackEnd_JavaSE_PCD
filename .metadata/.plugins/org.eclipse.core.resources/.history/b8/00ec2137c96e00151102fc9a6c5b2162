package pt.progJava.americoLib.control49;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CriarComponente extends JComponent {
	
	/* atributos */
		
	@SuppressWarnings("unused")
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("A minha Componente!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MyPanel());
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	/* construtor */
	
	
	/* outras rotinas */
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawLine(0,  0,  getWidth(), getHeight());
		g.drawLine(50,  50,  300, 300);
	}
	
	
	public void repaint() {
		//... painting
	}
	
	public void revalidate() {
		//... changing the componentś structure
	}

}
