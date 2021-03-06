package pt.progJava.americoLib.control114;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

//LINK READING/VIEWING
//http://docs.oracle.com/javase/tutorial/uiswing/components/border.html
//https://www.youtube.com/watch?v=Db3cC5iPrOM

@SuppressWarnings("serial")
public class Start_SWING_createGRID_01_useBorders extends JFrame{

	/*ATRIBUTES	*/
	//CHANGE INPUT DATA ---------------------------------------------
	private static final int SIZE_OF_WINDOWS_SIDE = 6;				//					
	//---------------------------------------------------------------
	private static final int SIZE_OF_WINDOWS = SIZE_OF_WINDOWS_SIDE * SIZE_OF_WINDOWS_SIDE; //square = L x L;
	
	//PANELS
	JPanel mainWindows = new JPanel();
	JPanel square[] = new JPanel[SIZE_OF_WINDOWS];
	
	/*CONSTRUCTOR*/
	public Start_SWING_createGRID_01_useBorders() {
		super("GRID: Adapting and Resizable");
		
		//INSTRUCTIONS
		setSize(600,600);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,100);
		setForeground(Color.GREEN);
		setBackground(Color.BLACK);
		
		//CREATE LAYOUT
		mainWindows.setLayout(new GridLayout(SIZE_OF_WINDOWS_SIDE,SIZE_OF_WINDOWS_SIDE));
		
		for (int i = 0; i < SIZE_OF_WINDOWS; i++) {
			square[i] = new JPanel();
			addBorderFactory(i);
			mainWindows.add(square[i]);
		}
		add(mainWindows);
		
		//TESTS
		tests();
		
		//FINAL INSTRUCTION
		setVisible(true);

	}
	
	/*OTHER METHODS*/
	private JPanel addBorderFactory(int i) {
		square[i].setBorder(BorderFactory.createLineBorder(Color.BLUE));
		return square[i];
	}
	
	public void changeBorderFactory(int i, int counter_changeBorderFactory) {
		
		// CHANGE COLOR
		switch (counter_changeBorderFactory) {
		case 0:
			square[i].setBorder(BorderFactory.createLineBorder(Color.PINK));
			break;
		case 1:
			square[i].setBorder(BorderFactory.createLoweredBevelBorder());
			break;
		case 2:
			square[i].setBorder(BorderFactory.createRaisedBevelBorder());
			break;
		case 3:
			square[i].setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED), "" + i));
			break;
		case 4:
			ImageIcon icon = new ImageIcon(getClass().getResource("images/wave.png"));
			square[i].setBorder(BorderFactory.createMatteBorder(-1, -1, -1, -1, icon));
			break;
		case 5:
			square[i].setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createLoweredBevelBorder()));
			break;
		case 6:
			Border raisedbevel = BorderFactory.createRaisedBevelBorder();
			Border loweredbevel = BorderFactory.createLoweredBevelBorder();
			Border compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
			Border redline = BorderFactory.createLineBorder(Color.red);
			//PUT TOGETHER
			square[i].setBorder(BorderFactory.createCompoundBorder(redline, compound));
			break;
		default:
			square[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			break;
		}
	}
	public void changeBorderFactoryImageJpg(int i, String string) {
		ImageIcon icon = new ImageIcon(getClass().getResource("images/" + string + ".jpg"));
		JButton iconButton = new JButton(icon);
		iconButton.getMaximumSize();
		square[i].add(iconButton);
	}
	public void tests() {
		//TESTS
		changeBorderFactory(0, 0);
		changeBorderFactory(2, 1);
		changeBorderFactory(4, 2);
		changeBorderFactory(6, 3);
		changeBorderFactory(8, 4);
		changeBorderFactory(10, 5);
		changeBorderFactory(12, 6);
		changeBorderFactoryImageJpg(14, "food");
		changeBorderFactoryImageJpg(16, "turbo");
		changeBorderFactoryImageJpg(18, "wall");
		changeBorderFactoryImageJpg(25, "food1");
	}
	public static void main(String[] args) {
		new Start_SWING_createGRID_01_useBorders();
	}
}
