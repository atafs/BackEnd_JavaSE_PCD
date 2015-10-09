package pt.progJava.americoLib.control48;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonsListener implements ActionListener{
	
	/* atributos */
	private JButton criarBotoes1, criarBotoes2;
	
	/* construtor */
	public ButtonsListener (JButton criarBotoes1, JButton criarBotoes2) {
		
		this.criarBotoes1 = criarBotoes1;
		this.criarBotoes2 = criarBotoes2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == criarBotoes1) {
			System.out.println(("Eu sou o Americo"));
		}
		else if (e.getSource() == criarBotoes2) {
			System.out.println("Mas tambem me chamo Tomas...");
		}
	}

		
}
