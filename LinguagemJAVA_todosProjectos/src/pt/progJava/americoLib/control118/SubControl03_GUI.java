package pt.progJava.americoLib.control118;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SubControl03_GUI extends JFrame{
	
	//ATTRIBUTES
	private SubControl03_Swamp swamp;

	//CONSTRUCTOR
	public SubControl03_GUI() {
		
		swamp = new SubControl03_Swamp();
		this.add(swamp);
		
		setup();
		
	}
	
	public void setup() {
		setTitle("AmericoLIB SNACK GAME");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setLocation(100,100);
		
		//FINAL INSTRUCTION
		setVisible(true);
	}

}
