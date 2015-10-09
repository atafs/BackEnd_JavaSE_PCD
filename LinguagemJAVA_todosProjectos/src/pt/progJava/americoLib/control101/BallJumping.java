package pt.progJava.americoLib.control101;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class BallJumping extends JPanel implements ActionListener {

	//ATTRIBUTES
	Timer t = new Timer(4, this);
	double x = 0, y = 0, velX = 2, velY = 2;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D circle = new Ellipse2D.Double(x, y, 60, 40);
		g2.fill(circle);
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x < 0 || x > 560) {
			velX =- velX;
		}
		
		if(y < 0 || y >360) {
			velY =- velY;
		}
		
		x += velX;
		y += velY;
		repaint();
	}
	
}
