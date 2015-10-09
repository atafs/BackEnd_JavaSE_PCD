package pt.progJava.americoLib.control104;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LineGui extends JPanel {

	// ATTRIBUTES
	private final int MAX_X_WINDOW = 560;
	
	private int id = 1;
	private String name;
	private Coordenates position;

	@SuppressWarnings("unused")
	private int count = 1; // counter

	// CONSTRUCTOR
	public LineGui(String name, int x, int y, int dimX, int dimY) {
		this.name = name;
		position = new Coordenates(x, y, dimX, dimY);
		sneakThread.start();
	}
	
	//THREAD
	private Thread sneakThread = new Thread() {

		// RUN
		public void run() {

			try {
				for (int i = 0; i < 101; i++) {

					// MOVING
					int xTemp = position.getX();;
					xTemp += (int) (Math.random() * 45);
					
					position.setX(xTemp);
					repaint();
					validate();

					if (position.getX() >= MAX_X_WINDOW) {
						System.out.println("WE HAVE A SNEAK WINNER, NAMED -> " + name);
						position.setX(0);
						repaint();
						validate();
					}

					System.out.println("[Sneak Id -> " + id
							+ "]; [Sneak Name -> " + name
							+ "]; [MOVING ;-) x -> " + position.getX());
					sleep((long) (Math.random() * 500));
				}
				System.out.println("TESTE COMPLECT");
				System.exit(0);
				
			} catch (InterruptedException e) {
				System.out.println(id + " done");
			}
		}
	};

	// PAINT
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLUE);

		//GRID DRAWING
		for (int i = 0; i < 900; i += 30) {
			g.drawLine(getWidth() / 30 + i, 0, getWidth() / 30 + i, getHeight()); // horizontal
			g.drawLine(0, getHeight() / 30 + i, getWidth(), getHeight() / 30
					+ i);// vertical

			count++;
		}
		
		//SNAKE COLOR
		int random = (int) (Math.random() * 5);
		switch (random) {
		case 0:
			g.setColor(Color.GRAY);
			break;
		case 1:
			g.setColor(Color.CYAN);
			break;
		case 2:
			g.setColor(Color.GREEN);
			break;
		case 3:
			g.setColor(Color.MAGENTA);
			break;
		case 4:
			g.setColor(Color.RED);
			break;
		default:
			g.setColor(Color.BLACK);
			break;
		}
		
		//SNAKE SIZE
		g.fillRect(position.getX(), position.getY(), Math.abs(position.getDimX()), Math.abs(position.getDimY()));
			
	}
	
	public void setPoint(int x, int y) {
		position.setX(x);
		position.setX(y);
	}

}
