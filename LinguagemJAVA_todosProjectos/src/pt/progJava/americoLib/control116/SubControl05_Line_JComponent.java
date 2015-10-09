package pt.progJava.americoLib.control116;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class SubControl05_Line_JComponent extends JComponent {

	//ATTRIBUTES
	private final int SQUARE = 30;
	
	private int x = SQUARE;
	private int y = 32;
	private int dimX = SQUARE*4;
	private int dimY = 15;
	
	//PAINT
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
