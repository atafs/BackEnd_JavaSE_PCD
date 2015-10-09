package pt.progJava.americoLib.control61;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Sentinela implements ActionListener {

	// atributos
	private JButton okButton, cancelButton;

	// construtor
	public Sentinela(JButton okButton, JButton cancelButton) {
		super();
		this.okButton = okButton;
		this.cancelButton = cancelButton;
	}

	// rotinas (forcada pela interface ActionListener)
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == okButton) {
			System.out.println("Carregou no botao OK.");
		}
		else if(e.getSource() == cancelButton) {
			System.out.println("Carregou no botao Cancel.");
		}

	}
	
	public static void main(String[] args) {
		
		JButton okButton = new JButton();
		JButton cancelButton = new JButton();
		new Sentinela(okButton, cancelButton);
	}

}
