package control_3CD.Start_PCD_week01._2_1_MaquinadeCalcular;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Calculator{

	//ATTRIBUTES
	private JFrame container;
	private JTextField display;
	private String displayContext = "";
	
	private ArrayList<Double> addList = new ArrayList<Double>();
	
	public Calculator() {
		container = new JFrame();
		
		// Create panel p1 for the buttons and set GridLayout
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 4));

		//BUTTONS
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton plus = new JButton("+");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton minus = new JButton("-");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton multiply = new JButton("*");
		JButton zero = new JButton("0");
		JButton dot = new JButton(".");
		JButton chapeu = new JButton("^");
		JButton divide = new JButton("/");
		
		JButton clean = new JButton("C");
		JButton total = new JButton("=");

		
		//LISTENERS
		p1.add(seven);
		seven.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("7");
				addList.add(7.0);

			}
		});
		
		p1.add(eight);
		eight.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("8");
				addList.add(8.0);

			}
		});
		
		p1.add(nine);	
		nine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("9");
				addList.add(9.0);

			}
		});
		
		p1.add(plus);
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("+");

			}
		});
		
		// ADD 4,5,6,-
		p1.add(four);
		four.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("4");
				addList.add(4.0);

			}
		});
		
		p1.add(five);
		five.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("5");
				addList.add(5.0);

			}
		});
		
		p1.add(six);
		six.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("6");
				addList.add(6.0);

			}
		});
		
		p1.add(minus);
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("-");

			}
		});
		
		// ADD 1,2,3,*
		p1.add(one);
		one.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1");
				addList.add(1.0);

			}
		});
		
		p1.add(two);
		two.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("2");
				addList.add(2.0);

			}
		});
		
		p1.add(three);
		three.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("3");
				addList.add(3.0);

			}
		});
		
		p1.add(multiply);
		multiply.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("*");

			}
		});
		
		// ADD 1,2,3,*
		p1.add(zero);
		zero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("0");
				addList.add(0.0);

			}
		});
		
		p1.add(dot);
		dot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(".");

			}
		});
		
		p1.add(chapeu);
		chapeu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("^");

			}
		});
		
		p1.add(divide);
		divide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("/");

			}
		});
		
		// Create panel p2 to hold a text field and p1
		JPanel p2 = new JPanel(new BorderLayout());
		p2.setLayout(new GridLayout(2, 1));

		//SEPARETE BUTTONS
		p2.add(clean);
		clean.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addList.removeAll(addList);
				displayContext = "0";
				display.setText(displayContext);
			}
		});
		
		p2.add(total);
		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double sum = 0.0;
				for (Double number : addList) {
					sum += number;
				}
				
				displayContext = String.valueOf(sum);
				display.setText(displayContext);
			}
		});
	
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
	
	//OPERATIONS
	
	/** */
	public void addValues() {
		
	}
	
	/** */
	public void subtractValues() {
		
	}
	
	/** */
	public void multiplyValues() {
		
	}
	
	/** */
	public void divideValues() {
		
	}

	/** Main method */
	public static void main(String[] args) {
		Calculator gui = new Calculator();
		JFrame frame = gui.container;
		gui.init(frame);
		gui.execute(frame);	
	}
}