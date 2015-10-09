package pt.progJava.americoLib.control117;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class SubControl04_MouseListener implements MouseListener {

	//ATTRIBUTES
	private int id;
	@SuppressWarnings("unused")
	private JPanel panel;

	// CONSTRUCTORS
	public SubControl04_MouseListener(int id, JPanel panel) {
		this.id = id;
		this.panel = panel;
	}
	
	public SubControl04_MouseListener(JPanel panel) {
		this.panel = panel;
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
