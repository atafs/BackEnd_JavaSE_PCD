package pt.progJava.americoLib.control53;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class HorseListener extends JFrame implements ActionListener {

	//atributos
	@SuppressWarnings("unused")
	private JTextField textField;
	
	//construtor
	public HorseListener(JTextField textField) throws HeadlessException {
		super();
		this.textField = textField;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//...
	}



}
