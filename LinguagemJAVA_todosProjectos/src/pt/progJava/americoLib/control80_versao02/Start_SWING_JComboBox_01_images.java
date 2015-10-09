package pt.progJava.americoLib.control80_versao02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Start_SWING_JComboBox_01_images extends JFrame{
	
	//CREATE an array of String
	private String[] timorTitle = {"Timor ONE ", "Timor TWO ", "Timor THREE ", "Timor FOUR ", "Timor FIVE ", "Timor SIX"};
	
	//DECLARE ImageIcon
	private ImageIcon[] timorImages = { 
			new ImageIcon(this.getClass().getResource("image/timor1.jpg")), 
			new ImageIcon(this.getClass().getResource("image/timor2.jpg")), 
			new ImageIcon(this.getClass().getResource("image/timor3.jpg")), 
			new ImageIcon(this.getClass().getResource("image/timor4.jpg")), 
			new ImageIcon(this.getClass().getResource("image/timor5.png")), 
			new ImageIcon(this.getClass().getResource("image/timor6.jpg")) 
			};
	
	//DECLARE array of Strings
	private String[] timorDescription = new String[25];
	
	//DECLARE description panel
	private DescriptionPanel DescriptionPanel = new DescriptionPanel();
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox jcbo = new JComboBox(timorTitle);
	
	
	public static void main(String[] args) {
		Start_SWING_JComboBox_01_images frame = new Start_SWING_JComboBox_01_images();
		
		//instruction of window
		frame.setBackground(Color.CYAN);
		frame.pack();
		frame.setTitle("ALBUM FOTOS Timor");
		frame.setSize(800,400);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Start_SWING_JComboBox_01_images() {
		
		//SET text description
		timorDescription[0] = "Image of TIMOR ONE!!! Praias Fantasticas!!!";
		timorDescription[1] = "Image of TIMOR TWO!!! Bebedeiras Alucinantes!!!";
		timorDescription[2] = "Image of TIMOR THREE!!! As nativas sao TOP!!!";
		timorDescription[3] = "Image of TIMOR FOUR!!! Bora fazer Mergulho!!!";
		timorDescription[4] = "Image of TIMOR FIVE!!! Geografica do Pais!!!";
		timorDescription[5] = "Image of TIMOR FIVE!!! NICE Babe!!!";
		
		setDisplay(0);
		
		//ADD comboBox to descptionPanel
		add(jcbo, BorderLayout.NORTH);
		add(DescriptionPanel, BorderLayout.CENTER);
		
		//REGISTER listenner
		jcbo.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				setDisplay(jcbo.getSelectedIndex());
			}
		});
	}
	
	public void setDisplay(int index) {
		DescriptionPanel.setTitle(timorTitle[index]);
		DescriptionPanel.setImageIcon(timorImages[index]);
		DescriptionPanel.setDescription(timorDescription[index]);
	}
}
