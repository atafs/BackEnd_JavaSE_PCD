package pt.progJava.americoLib.control104;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class MouseLISTENER implements MouseListener{

	//attributes
	private JComponent component;
	
	//constructor
	public MouseLISTENER(JComponent component) {
		this.component = component;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		//JUST FOR 1º and 10º QUADRANT
		int square = 30;
		if ( e.getY() < (component.getHeight()/30) && e.getX() < component.getWidth()/30) {
			JOptionPane.showMessageDialog(component, 1 + " Quadrante");
		} else if ( e.getY() > component.getHeight()/30 && e.getY() < (component.getHeight()/30)+square && e.getX() < component.getWidth()/30) {
			JOptionPane.showMessageDialog(component, 31 + " Quadrante");
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
