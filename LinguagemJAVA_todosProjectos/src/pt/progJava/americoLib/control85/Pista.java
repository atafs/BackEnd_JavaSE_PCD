package pt.progJava.americoLib.control85;


import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class Pista extends JLabel{

	//ATTRIBUTES
	private int carro1 = 0;
	private int carro2 = 0;
	private int carro3 = 0;
	private int carro4 = 0;
	private final int NUM_STEPS = 15;
	private ImageIcon icon1;
	private ImageIcon icon2;
	private ImageIcon icon3;
	private ImageIcon icon4;
	
	//CONSTRUCTOR
	public Pista() {
		this.carro1 = 0;
		this.carro2 = 0;
		this.carro3 = 0;
		this.carro4 = 0;
		
		this.icon1 = new ImageIcon(getClass().getResource("fotos/car5.jpg"));
		this.icon2 = new ImageIcon(getClass().getResource("fotos/car6.jpg"));
		this.icon3 = new ImageIcon(getClass().getResource("fotos/car7.jpg"));
		this.icon4 = new ImageIcon(getClass().getResource("fotos/car8.jpg"));
		
	}
	
	//MOVE CAR
	public boolean move(int car) {
		repaint();
		if(car == 1) {
			return (++carro1 == NUM_STEPS);
		} else if(car == 2) {
			return (++carro2 == NUM_STEPS);
		} else if(car == 3) {
			return (++carro3 == NUM_STEPS);
		} else {
			return (++carro4 == NUM_STEPS);
		}
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		int y1 = 1 * getHeight() / 6;
		int y2 = 2 * getHeight() / 6;
		int y3 = 3 * getHeight() / 6;
		int y4 = 4 * getHeight() / 6;
		
		int x1 = getWidth() / NUM_STEPS * carro1;
		int x2 = getWidth() / NUM_STEPS * carro2;
		int x3 = getWidth() / NUM_STEPS * carro3;
		int x4 = getWidth() / NUM_STEPS * carro4;
		
		g.drawLine(0, getHeight()/6*1 + icon1.getIconHeight(), getWidth(), getHeight()/6*1 + icon1.getIconHeight());
		g.drawLine(0, getHeight()/6*2 + icon2.getIconHeight(), getWidth(), getHeight()/6*2 + icon2.getIconHeight());
		g.drawLine(0, getHeight()/6*3 + icon3.getIconHeight(), getWidth(), getHeight()/6*3 + icon3.getIconHeight());
		g.drawLine(0, getHeight()/6*4 + icon4.getIconHeight(), getWidth(), getHeight()/6*4 + icon4.getIconHeight());

		g.drawImage(icon1.getImage(), x1, y1, null);
		g.drawImage(icon2.getImage(), x2, y2, null);
		g.drawImage(icon3.getImage(), x3, y3, null);
		g.drawImage(icon4.getImage(), x4, y4, null);
		
	}
	

	
	
	
}
