package control_3CD.Start_PCD_week02._2_1_MaquinadeCalcular.old;

import javax.swing.JButton;

public class NewButton {
	
	//ATTRIBUTES
	private JButton button;
	private double value;

	//CONSTRUCTOR
	public NewButton(JButton button, double value) {
		this.button = button;
		this.value = value;
	}

	//GETTERS AND SETTERS
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
}
