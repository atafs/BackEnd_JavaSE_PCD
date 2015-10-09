package pt.progJava.americoLib.control103;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class LineGui extends JPanel implements ActionListener{

	//ATTRIBUTES
	private final int SQUARE = 30;
	private final int THICKNESS = 15;
	
	private int x = SQUARE;
	private int y = 55;
	private int dimX = SQUARE*4;
	private int dimY = THICKNESS;
	
	private int id = 1;
	private String name;
	
	@SuppressWarnings("unused")
	private int count = 1; //counter
	
	//TEST (probably to delete)
	Timer t = new Timer(4, this);
	double x1 = 0, y1 = 0, velX = 2, velY = 2;
	
	private Thread sneakThread = new Thread() {
		
		//RUN
		@SuppressWarnings("static-access")
		public void run() {
				
			try {	
				for (int i = 0; i < 10; i++) {	
						
					//TEST WITH FOR (to erase)
				
					System.out.println("[" + id + " -> sneak Id]; [" + name + " -> sneak Name];");
					sneakThread.sleep ((long)(Math.random() * 2000));
				}
				System.out.println("TESTE COMPLECT");		
			} catch (InterruptedException e) {
				System.out.println(id + " done");
			}
		}	
	};
	
	//CONSTRUCTOR
	public LineGui(String name) {
		this.name = name;
		sneakThread.start();
	}

	//PAINT
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		
		for (int i = 0; i < 900; i+=30) {		
			g.drawLine(getWidth()/30 + i,0, getWidth()/30 + i, getHeight()); //horizontal
			g.drawLine(0, getHeight()/30 + i, getWidth(), getHeight()/30 + i);//vertical
	
			count++;
		}
		
		g.setColor(Color.BLUE);
		int xd = (dimX > 0) ? x : x + dimX;
		int yd = (dimY > 0) ? y : y + dimY;
		g.fillRect(xd, yd, Math.abs(dimX), Math.abs(dimY));
		
		t.start();
	}
	
	//ACTION_LISTENER
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(x < 0 || x > 560) {
			velX = -velX;
		}
			
		x += velX;
		repaint();
	}
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
