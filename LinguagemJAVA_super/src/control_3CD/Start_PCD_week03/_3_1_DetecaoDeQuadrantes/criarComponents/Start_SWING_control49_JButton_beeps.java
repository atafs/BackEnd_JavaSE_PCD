package control_3CD.Start_PCD_week03._3_1_DetecaoDeQuadrantes.criarComponents;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Start_SWING_control49_JButton_beeps extends JPanel implements ActionListener{
	
	/* atributos */
	JButton button;
	
	
	/* construtor */
	public Start_SWING_control49_JButton_beeps() {
		super(new BorderLayout());
		button = new JButton("Click me");
		button.setPreferredSize(new Dimension(200,80));
		add(button, BorderLayout.CENTER);
		button.addActionListener(this);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Toolkit.getDefaultToolkit().beep();
		
	}
	
	/**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
	private static void createAndShowGUI() {
		//create and set up the window
		JFrame frame = new JFrame("Beeper");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//create and set up content pane
		JComponent newContentPane = new Start_SWING_control49_JButton_beeps();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
	
		//display the window
		frame.pack();
		frame.setVisible(true);
	}
	
	   public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
	
	
	
	


	
	
	

}
