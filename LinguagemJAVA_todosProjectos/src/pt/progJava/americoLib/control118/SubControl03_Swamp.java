package pt.progJava.americoLib.control118;

import java.awt.GridLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SubControl03_Swamp extends JPanel {

	//ATTRIBUTE:  CHANGE INPUT DATA ---------------------------------
	private final int LINES = 30;									//
	//---------------------------------------------------------------
	private SubControl03_Line square;
	private final int AREA_TOTAL = LINES * LINES;	//square	
	private final int MAX = 600; //if superior to window, it fills max size

	//CONSTRUCTOR
	public SubControl03_Swamp() {
		this.addMouseListener(new SubControl03_MouseListener(this));
		GridLayout grid = new GridLayout(LINES,LINES);
		this.setLayout(grid);
		
		for (int i = 0; i < AREA_TOTAL; i++) {
			square = new SubControl03_Line(0, 0, MAX, MAX);
			this.add(square);
		}

	}
	
}
