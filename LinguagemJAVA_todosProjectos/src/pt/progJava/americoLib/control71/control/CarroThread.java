package pt.progJava.americoLib.control71.control;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CarroThread extends JLabel implements Runnable {

	/* attributes */
	private Thread carroThread = null;
	private int posX;
	private int posY;
	@SuppressWarnings("unused")
	private ImageIcon imagem;
	private String nome;
	
	/* constructor */
	public CarroThread(String nome, ImageIcon imagem, int posX, int posY) {
		super(imagem);
		this.posX = posX;
		this.posY = posY;
		this.imagem = imagem;
		this.nome = nome;
		
		carroThread = new Thread(this, nome);
		carroThread.start();
		
	}

	@Override
	public void run() {
		posX += new Random().nextInt(5) * 38;
		this.setLocation(posX, posY);
		
		if(posX >= 1000) {
			Thread.yield();
			System.out.println("Have a Final Score: " + nome);
			return;
		}
		
		try{
			Thread.sleep(new Random().nextInt(5) * 100);
			run();

		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}
