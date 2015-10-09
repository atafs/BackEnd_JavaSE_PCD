package pt.progJava.americoLib.control50;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class MyCanvas extends JComponent {

	private int x = 100;
	private int y = 200;
	private int dimX = 100;
	private int dimY = 50;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		int xd = (dimX > 0) ? x : x + dimX;
		int yd = (dimY > 0) ? y : y + dimY;
		g.fillOval(xd, yd, Math.abs(dimX), Math.abs(dimY));
	}

	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setDist(int x, int y) {
		this.dimX = x - this.x;
		this.dimY = y - this.y;
		repaint();
	}
}
