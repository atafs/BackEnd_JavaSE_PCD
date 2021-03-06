package pt.progJava.americoLib.control118;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;


public class SubControl03_MouseListener implements MouseListener {

	//ATTRIBUTES
	private int id;
	@SuppressWarnings("unused")
	private JComponent component;

	// CONSTRUCTORS
	public SubControl03_MouseListener(JComponent component) {
		this.component = component;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("[ENTERED at x = " + e.getX() + "; in CELL: " + id + "]");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("[EXITED in CELL: " + id + "]");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("[PRESSED in CELL: " + id + "]");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("[RELEASED in CELL: " + id + "]");
	}

}
