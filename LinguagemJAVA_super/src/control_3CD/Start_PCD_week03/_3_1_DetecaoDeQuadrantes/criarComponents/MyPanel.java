package control_3CD.Start_PCD_week03._3_1_DetecaoDeQuadrantes.criarComponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MyPanel extends JPanel{
	
	public MyPanel() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));		
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(250,200);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//draw text
		g.drawString("This is my custom Panel!!", 10, 20);
	}
	

}
