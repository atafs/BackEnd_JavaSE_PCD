package pt.progJava.americoLib.control47;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class SentinelaListener implements ActionListener {

	private JTextField screen;

	public SentinelaListener(JTextField screen) {
		super();
		this.screen = screen;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton b = (JButton) event.getSource();
		screen.setText(b.getText());
	}

}
