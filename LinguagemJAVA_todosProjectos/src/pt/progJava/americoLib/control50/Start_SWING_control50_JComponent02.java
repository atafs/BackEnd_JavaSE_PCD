package pt.progJava.americoLib.control50;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Start_SWING_control50_JComponent02 {
	private MyCanvas canvas = new MyCanvas();
	private JFrame frame = new JFrame("My paint");

	public Start_SWING_control50_JComponent02() {
		createGUI();
	}

	private void createGUI() {
		frame.add(canvas);
		canvas.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				canvas.setDist(e.getPoint().x, e.getPoint().y);			
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				canvas.setPoint(e.getPoint().x, e.getPoint().y);			
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		canvas.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				canvas.setDist(e.getPoint().x, e.getPoint().y);				
			}
		});
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void init() {
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Start_SWING_control50_JComponent02().init();
	}
}
