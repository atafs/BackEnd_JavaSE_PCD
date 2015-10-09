package pt.progJava.americoLib.control76_aula2_1_versao2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListenerForButtons implements ActionListener{

	//attributes
	private JButton addButton = new JButton();
	@SuppressWarnings("unused")
	private JButton newButton = new JButton();
	private Start_SWING_JButtonWithListener_createButtons_control76 window;

	//constructor
	public ListenerForButtons(JButton addButton, JButton newButton, Start_SWING_JButtonWithListener_createButtons_control76 window) {
		this.window = window;
		this.addButton = addButton;
		this.newButton = newButton;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		if(arg0.getSource() == addButton) {
			System.out.println("Carreguei no AddButton");
			window.addButton();
			}
		
		else if(arg0.getSource() == window.getNewButton()) {
			System.out.println("Carreguei no botao newButton!");
			window.deleteButton(window.getNewButton());
		}
		
	}



}
