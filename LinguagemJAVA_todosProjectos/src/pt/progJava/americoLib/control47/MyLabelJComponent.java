package pt.progJava.americoLib.control47;

import java.awt.Graphics;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class MyLabelJComponent extends JComponent {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Ola a Todos", getWidth() / 2, getHeight() / 2);
		g.drawLine(0, 0, getWidth(), getHeight());
	}
}
