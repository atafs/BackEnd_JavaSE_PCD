package pt.progJava.americoLib.control66;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Line_JComponent extends JComponent {

	private int x = 20;
	private int y = 100;
	private int dimX = 400;
	private int dimY = 3;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		int xd = (dimX > 0) ? x : x + dimX;
		int yd = (dimY > 0) ? y : y + dimY;
		g.fillRect(xd, yd, Math.abs(dimX), Math.abs(dimY));
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
