package pt.progJava.americoLib.control104;

public class Coordenates {
	
	// ATTRIBUTES
	private int x = 30;
	private int y = 55;
	private int dimX = 120;
	private int dimY = 15;
	
	//CONSTRUCTOR
	public Coordenates(int x, int y, int dimX, int dimY) {
		this.x = x;
		this.y = y;
		this.dimX = dimX;
		this.dimY = dimY;
	}
	
	//GETTERS
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getDimX() {
		return dimX;
	}
	public void setDimX(int dimX) {
		this.dimX = dimX;
	}
	public int getDimY() {
		return dimY;
	}
	public void setDimY(int dimY) {
		this.dimY = dimY;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
