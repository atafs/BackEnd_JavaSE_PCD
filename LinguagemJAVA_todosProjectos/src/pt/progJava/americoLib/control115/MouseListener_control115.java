package pt.progJava.americoLib.control115;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class MouseListener_control115 implements MouseListener {

	//ATTRIBUTES
	private int id;
	@SuppressWarnings("unused")
	private JPanel panel;

	// CONSTRUCTORS
	public MouseListener_control115(int id, JPanel panel) {
		this.id = id;
		this.panel = panel;
	}
	
	public MouseListener_control115(JPanel panel) {
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
