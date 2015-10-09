package pt.progJava.americoLib.control77;

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
		
		int posVert = (e.getY() < component.getHeight()/2?0:1);
		int posHor = (e.getX() < component.getWidth()/2?0:1);
		int quadrante = posHor + posVert * 2;
		JOptionPane.showMessageDialog(component, quadrante + 1 + " Quadrante");
		
		//.setBackground(Color.BLACK);
		//.setForeground(Color.GREEN);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
