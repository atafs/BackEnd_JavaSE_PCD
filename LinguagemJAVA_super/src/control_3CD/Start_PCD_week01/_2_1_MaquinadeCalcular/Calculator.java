package control_3CD.Start_PCD_week01._2_1_MaquinadeCalcular;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator{

	//ATTRIBUTES
	private JFrame container;
	private JTextField display;
	private String displayContext = "";
	
	public Calculator() {
		container = new JFrame();
		
		// Create panel p1 for the buttons and set GridLayout
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 4));

		//HARD CODED SOLUTION
		// ADD 7,8,9,+
		p1.add(new JButton("7"));
		p1.add(new JButton("8"));
		p1.add(new JButton("9"));	
		JButton add = new JButton("+");
		p1.add(add);
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("+");
				displayContext += "+";
				display.setText(displayContext);
			}
		});
		
		// ADD 4,5,6,-
		p1.add(new JButton("4"));
		p1.add(new JButton("5"));
		p1.add(new JButton("6"));
		p1.add(new JButton("-"));
		
		// ADD 1,2,3,*
		p1.add(new JButton("1"));
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p1.add(new JButton("*"));
		
		// ADD 1,2,3,*
		p1.add(new JButton("0"));
		p1.add(new JButton("."));
		p1.add(new JButton("^"));
		p1.add(new JButton("/"));
		

		// Create panel p2 to hold a text field and p1
		JPanel p2 = new JPanel(new BorderLayout());
		p2.setLayout(new GridLayout(2, 1));

		//SEPARETE BUTTONS
		JButton clean = new JButton("C");

		p2.add(clean);
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				displayContext = "0";
				display.setText(displayContext);
			}
		});
		p2.add(new JButton("="));
		
		//DISPLAY
		display = new JTextField("write values");
		display.setBackground(Color.GREEN);

		// Add contents to the frame
		container.setLayout(new BorderLayout());
		container.add(p1, BorderLayout.WEST);
		container.add(p2, BorderLayout.EAST);
		container.add(display, BorderLayout.CENTER);

	}
	
	/** */
	public void init(JFrame frame) {
		frame.setTitle("CALCULATOR ISCTE IUL");
		frame.setSize(800, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	/** */
	public void execute(Frame frame) {
		frame.setVisible(true);

	}

	/** Main method */
	public static void main(String[] args) {
		Calculator gui = new Calculator();
		JFrame frame = gui.container;
		gui.init(frame);
		gui.execute(frame);
		
	}
}