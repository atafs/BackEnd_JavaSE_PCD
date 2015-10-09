package pt.progJava.americoLib.control118;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class SubControl03_Line extends JComponent {

	//ATTRIBUTES
	private int id = 1;
	private String name;
	private SubControl03_Coordenates position;
	
	//CONSTRUCTOR
	public SubControl03_Line(int id, String name, int x, int y, int dimX, int dimY) {
		this.id = id;
		this.name = name;
		position = new SubControl03_Coordenates(x, y, dimX, dimY);
		
		//snakeThread = new SubControl01_SnakeThread(this);
		//snakeThread.start();
	}
	
	public SubControl03_Line(int x, int y, int dimX, int dimY) {
		position = new SubControl03_Coordenates(x, y, dimX, dimY);

	}

	//PAINT
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// GRID COLOR
		int random = (int) (Math.random() * 5);
		switch (random) {
		case 0:
			g.setColor(Color.GRAY);
			g.drawRect(position.getX(), position.getY(), position.getDimX(), position.getDimY());
			
			break;
		case 1:
			g.setColor(Color.CYAN);
			g.drawRect(position.getX(), position.getY(), position.getDimX(), position.getDimY());
			break;
		case 2:
			g.setColor(Color.GREEN);
			g.drawRect(position.getX(), position.getY(), position.getDimX(), position.getDimY());
			break;
		case 3:
			g.setColor(Color.MAGENTA);
			g.drawRect(position.getX(), position.getY(), position.getDimX(), position.getDimY());
			break;
		case 4:
			g.setColor(Color.RED);
			g.drawRect(position.getX(), position.getY(), position.getDimX(), position.getDimY());
			break;
		default:
			g.setColor(Color.BLACK);
			g.drawRect(position.getX(), position.getY(), position.getDimX(), position.getDimY());
			break;
		}
		
		// SNAKE SIZE
		//g.fillRect(position.getX(), position.getY(),Math.abs(position.getDimX()), Math.abs(position.getDimY()));
	}

	//GETTERS AND SETTERS
	public SubControl03_Coordenates getPosition() {
		return position;
	}

	public void setPosition(SubControl03_Coordenates position) {
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	

}
